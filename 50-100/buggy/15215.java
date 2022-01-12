@org.springframework.web.bind.annotation.RequestMapping(value = "/addcart", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView AddCartPost(@javax.validation.Valid
com.di.wang.payonline.model.paycart.PayCart payCart, org.springframework.validation.Errors errors) {
    if (errors.hasErrors()) {
        return new org.springframework.web.servlet.ModelAndView("redirect:/cart/addcart");
    }
    try {
        payCartService.save(payCart);
        return new org.springframework.web.servlet.ModelAndView("redirect:/cart/listall");
    } catch (org.springframework.dao.DataIntegrityViolationException ex) {
        errors.rejectValue("cart", "cart.serialnumber.notuniq", "has already registered");
        return new org.springframework.web.servlet.ModelAndView("redirect:/cart/addcart");
    }
}
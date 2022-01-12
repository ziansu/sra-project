@com.di.wang.payonline.controller.RequestMapping(value = "/addcart", method = RequestMethod.POST)
public java.lang.String AddCartPost(@javax.validation.Valid
com.di.wang.payonline.model.paycart.PayCart payCart, org.springframework.validation.Errors errors) {
    if (errors.hasErrors()) {
        return "redirect:/cart/addcart";
    }
    try {
        payCartService.save(payCart);
        return "redirect:/cart/listall";
    } catch (org.springframework.dao.DataIntegrityViolationException ex) {
        errors.rejectValue("cart", "cart.serialnumber.notuniq", "has already registered");
        return "redirect:/cart/addcart";
    }
}
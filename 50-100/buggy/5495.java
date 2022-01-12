@org.springframework.web.bind.annotation.RequestMapping(value = "/registration", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String registration(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute
dto.BuyerDTO buyerDTO, org.springframework.validation.BindingResult bindingResult, org.springframework.ui.Model model) {
    if (bindingResult.hasErrors()) {
        return "registration";
    }
    model.Buyer buyer = new model.Buyer(buyerDTO);
    buyerService.save(buyer);
    return "redirect:/login";
    try {
        model.Buyer buyer = new model.Buyer(buyerDTO);
        buyerService.save(buyer);
        return "redirect:/login";
    } catch (java.lang.Exception e) {
        model.addAttribute("errorSave", "Пользователь с таким логином уже существует!");
        return "registration";
    }
}
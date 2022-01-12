@org.springframework.web.bind.annotation.RequestMapping(value = "send-message", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String sendMessage(org.springframework.ui.Model model, @javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "contactUsForm")
com.davidbalazs.chess.data.ContactUsForm contactUsForm, org.springframework.validation.BindingResult result) {
    mainPageEnhancer.enhanceModelWithSideBar(model);
    if (result.hasErrors()) {
        com.davidbalazs.chess.controllers.ContactUsPageController.LOGGER.error("error submitting contactUsForm");
        return "pages/contactUsPage";
    }
    model.addAttribute("contactUsForm", generateContactUsForm());
    com.davidbalazs.chess.controllers.ContactUsPageController.LOGGER.info(("received message from user " + (contactUsForm.getUsername())));
    return "pages/contactUsPage";
}
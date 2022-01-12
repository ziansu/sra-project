@org.springframework.web.bind.annotation.GetMapping(value = "/contactform")
@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_ADMIN')")
public java.lang.String redirectContactForm(@org.springframework.web.bind.annotation.RequestParam(name = "id", required = false)
int id, org.springframework.ui.Model model) {
    com.udemy.backendninja.model.ContactModel contactModel = new com.udemy.backendninja.model.ContactModel();
    if (id != 0) {
        contactModel = contactService.findContactByIdModel(id);
    }
    model.addAttribute("contactModel", contactModel);
    return com.udemy.backendninja.constant.ViewConstant.CONTACT_FORM;
}
@org.springframework.web.bind.annotation.PostMapping(value = "/createUpdate")
public java.lang.String create(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute(value = "person")
boets.adresbestand.domain.Person person) {
    if ((person.getId()) != null) {
        personService.updatePerson(person);
        model.addAttribute("person", person);
        model.addAttribute("success", "success_update");
    }else {
        personService.savePerson(person);
        model.addAttribute("person", new boets.adresbestand.domain.Person());
        model.addAttribute("success", "success_create");
    }
    return boets.adresbestand.web.controller.PersonController.CREATE_UPDATE_PAGE;
}
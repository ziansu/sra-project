@org.springframework.web.bind.annotation.PostMapping(value = "/add")
public java.lang.String addPerson(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "person")
com.examples.spring.model.Persona person, org.springframework.validation.BindingResult result, org.springframework.ui.Model model) {
    if (result.hasErrors()) {
        return com.examples.spring.controller.PeopleController.VIEW_ADD_PERSON;
    }
    personaRepository.save(person);
    return com.examples.spring.controller.PeopleController.REDIRECT_PEOPLE;
}
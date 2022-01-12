@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.TEXT_HTML_VALUE)
public java.lang.String create(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute
com.example.MyEntity myEntity, org.springframework.validation.BindingResult result, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttrs, org.springframework.ui.Model model) {
    if (result.hasErrors()) {
        populateForm(model, myEntity);
        return "myEntity/create";
    }
    com.example.MyEntity newEntity = repository.save(myEntity);
    redirectAttrs.addAttribute("id", newEntity.getId());
    return "redirect:/myEntity/{id}";
}
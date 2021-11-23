@org.springframework.web.bind.annotation.RequestMapping(value = "/{myEntity}", method = org.springframework.web.bind.annotation.RequestMethod.PUT, produces = org.springframework.http.MediaType.TEXT_HTML_VALUE)
public java.lang.String update(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute
com.example.MyEntity myEntity, org.springframework.validation.BindingResult result, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttrs, org.springframework.ui.Model model) {
    if (result.hasErrors()) {
        populateForm(model, myEntity);
        return "myEntity/edit";
    }
    com.example.MyEntity savedMyEntity = repository.save(myEntity);
    redirectAttrs.addAttribute("id", savedMyEntity.getId());
    return "redirect:/myEntity/{id}";
}
@com.github.ksoichiro.todo.java.springboot.web.RequestMapping(value = "/create", method = RequestMethod.POST)
public java.lang.String create(java.security.Principal principal, @org.springframework.validation.annotation.Validated
com.github.ksoichiro.todo.java.springboot.form.TodoForm form, org.springframework.validation.BindingResult bindingResult, org.springframework.ui.Model model) {
    if (bindingResult.hasErrors()) {
        return index(principal, form, model);
    }
    org.springframework.security.core.Authentication authentication = ((org.springframework.security.core.Authentication) (principal));
    com.github.ksoichiro.todo.java.springboot.domain.User user = ((com.github.ksoichiro.todo.java.springboot.domain.User) (authentication.getPrincipal()));
    todoService.save(form, user.getId());
    return "redirect:/todos";
}
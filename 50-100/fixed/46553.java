@com.github.ksoichiro.todo.java.springboot.web.RequestMapping
public java.lang.String index(java.security.Principal principal, com.github.ksoichiro.todo.java.springboot.form.TodoForm form, org.springframework.ui.Model model) {
    model.addAttribute("allTodoStates", todoStateService.findAll());
    org.springframework.security.core.Authentication authentication = ((org.springframework.security.core.Authentication) (principal));
    com.github.ksoichiro.todo.java.springboot.domain.User user = ((com.github.ksoichiro.todo.java.springboot.domain.User) (authentication.getPrincipal()));
    model.addAttribute("allTodos", todoService.findAll(user.getId()));
    return "todos/index";
}
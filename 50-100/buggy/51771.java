@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String updateUserRoles(@org.springframework.web.bind.annotation.ModelAttribute
final org.egov.infra.admin.master.entity.User user, final org.springframework.validation.BindingResult errors, final org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttrs) {
    if (errors.hasErrors())
        return "/userrole/update/" + (user.getUsername());
    
    userService.updateUser(user);
    redirectAttrs.addFlashAttribute("message", "User Role successfully modified!");
    return "redirect:/userrole/view/" + (user.getUsername());
}
@cmpe451.group3.controller.RequestMapping(value = "/group/join", method = RequestMethod.GET)
public java.lang.String joinGroup(@cmpe451.group3.controller.RequestParam(required = false)
long id, org.springframework.ui.ModelMap model) {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    java.lang.String mail = auth.getName();
    java.lang.Long userid = userModel.getIDUserByEmail(mail);
    groupDAO.joinGroup(userid, id);
    return "redirect:/group/view?id=" + id;
}
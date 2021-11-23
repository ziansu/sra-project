@org.springframework.security.access.prepost.PreAuthorize(value = "#user.name == principal.username")
@org.springframework.web.bind.annotation.RequestMapping(value = "update", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String updateUser(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute(value = "user")
@javax.validation.Valid
gr.hua.dit.models.User user, org.springframework.validation.BindingResult result) {
    gr.hua.dit.UsersController.logger.info(" New User ");
    if (result.hasErrors()) {
        return "user";
    }
    gr.hua.dit.UsersController.logger.info(("form name " + (user.getName())));
    if ((user.getId()) == 0) {
        gr.hua.dit.UsersController.logger.info(" New User ");
        userDAO.save(user);
    }else {
        gr.hua.dit.UsersController.logger.info(" Existing User ");
        userDAO.update(user);
    }
    return "redirect:/users/all";
}
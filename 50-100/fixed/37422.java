@org.springframework.security.access.prepost.PreAuthorize(value = "@currentUserServiceImpl.canAccessUser(principal, #id)")
@com.worksap.stm2016.rd2.controller.RequestMapping(value = "/user/{id}/edit", method = RequestMethod.POST)
public java.lang.String handleEditUserForm(@javax.validation.Valid
@com.worksap.stm2016.rd2.controller.ModelAttribute(value = "editForm")
com.worksap.stm2016.rd2.model.UserEditForm editForm, org.springframework.validation.BindingResult bindingResult, @com.worksap.stm2016.rd2.controller.PathVariable
java.lang.Long id) {
    com.worksap.stm2016.rd2.controller.UserController.LOGGER.debug("Processing user edit form={},bindingResult={}", editForm, bindingResult);
    if (bindingResult.hasErrors()) {
        return "user_edit";
    }
    userService.edit(id, editForm);
    return "redirect:/user/{id}";
}
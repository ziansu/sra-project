@com.sang.topic.controller.web.RequestMapping(value = "", method = RequestMethod.POST)
public com.sang.topic.common.model.ValidationResponse create(@com.sang.topic.controller.web.ModelAttribute
@javax.validation.Valid
com.sang.topic.common.entity.User user, org.springframework.validation.BindingResult bindingResult, javax.servlet.http.HttpSession httpSession) {
    if (bindingResult.hasErrors()) {
        return com.sang.topic.util.ResponseUtil.failFieldValidation(bindingResult.getFieldErrors());
    }
    com.sang.topic.common.model.ValidationResponse res = userService.create(user);
    if (res.success()) {
        com.sang.topic.common.entity.User u = userService.getByUsername(user.getUsername());
        httpSession.setAttribute("sessionUser", u);
    }
    return res;
}
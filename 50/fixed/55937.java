@org.springframework.web.bind.annotation.RequestMapping(value = "/v01/user/modify", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json;charset=UTF-8")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String login(@org.springframework.web.bind.annotation.RequestBody
planhub.domain.User user) {
    return gson.toJson(modifyService.modifyService(user));
}
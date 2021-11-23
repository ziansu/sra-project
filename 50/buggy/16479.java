@org.springframework.web.bind.annotation.RequestMapping(value = "/showInfos")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object showUserInfos() {
    logger.debug("-----------------------showUserInfos-----------------------");
    java.util.List<com.roy.demo.model.UserInfo> userInfos = userService.getUsers();
    return userInfos;
}
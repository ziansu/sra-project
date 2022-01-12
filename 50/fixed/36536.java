@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
public java.lang.String login() throws java.io.IOException {
    jKMS.controller.ControllerHelper.init();
    jKMS.controller.ControllerHelper.checkFolders();
    return "login";
}
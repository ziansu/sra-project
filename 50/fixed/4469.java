@org.springframework.web.bind.annotation.RequestMapping(value = tran.example.presentation.controller.LoginFormController.DISPLAY_LOG_IN_MAPPING, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String displayLogin(java.security.Principal principal, org.springframework.ui.ModelMap model, @org.springframework.web.bind.annotation.RequestParam(value = tran.example.presentation.controller.LoginFormController.REDIRECT_MESSAGE_PARAM, required = false)
java.lang.String message) {
    return loginFormControllerService.displayLogin(principal, model, message);
}
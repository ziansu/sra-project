@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String manageUsers(org.springframework.ui.ModelMap model, javax.servlet.http.HttpServletRequest request) {
    model.addAttribute("logId", com.denimgroup.threadfix.service.util.ControllerUtils.getItem(request, "logId"));
    return "config/logs";
}
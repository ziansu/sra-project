@org.springframework.web.bind.annotation.RequestMapping(value = "/init", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public responses.StandardResponse init(final javax.servlet.http.HttpServletRequest request) {
    return adminService.init();
}
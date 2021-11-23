@org.springframework.web.bind.annotation.RequestMapping(value = "/stream")
public org.springframework.web.servlet.ModelAndView stream(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    request = wrapRequest(request);
    org.libresonic.player.domain.User user = securityService.getCurrentUser(request);
    if (!(user.isStreamRole())) {
        error(request, response, org.libresonic.player.controller.RESTController.ErrorCode.NOT_AUTHORIZED, ((user.getUsername()) + " is not authorized to play files."));
        return null;
    }
    streamController.handleRequest(request, response);
    return null;
}
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/getnotifications")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<eu.trentorise.smartcampus.communicator.model.Notification> getNotifications(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpSession session) throws java.io.IOException {
    try {
        java.lang.String token = request.getHeader(AcProviderFilter.TOKEN_HEADER);
        eu.trentorise.smartcampus.communicator.CommunicatorConnector communicatorConnector = new eu.trentorise.smartcampus.communicator.CommunicatorConnector(serverAddress);
        java.util.List<eu.trentorise.smartcampus.communicator.model.Notification> result = communicatorConnector.getNotifications(0L, 0, (-1), token);
        return ((java.util.List<eu.trentorise.smartcampus.communicator.model.Notification>) (result));
    } catch (java.lang.Exception e) {
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    return null;
}
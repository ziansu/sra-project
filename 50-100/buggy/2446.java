@org.springframework.web.bind.annotation.RequestMapping(value = "/getWelcomeMessage")
public void getWelcomeMessage(final javax.servlet.http.HttpServletRequest httpRequest, final javax.servlet.http.HttpServletResponse httpResponse) throws java.io.IOException {
    final com.jammcreations.model.Parameter parameter = userService.getParameter("WELCOME_MESSAGE");
    final com.jammcreations.json.Response response = new com.jammcreations.json.Response();
    response.setSuccess(true);
    response.setPayload(parameter.getValue());
    response.setMessage("Welcome message retrieved.");
    final java.io.PrintWriter writer = httpResponse.getWriter();
    summaryMapper.writeValue(writer, response);
    writer.flush();
    writer.close();
}
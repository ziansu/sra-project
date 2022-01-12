private void writeCommands(final java.util.List<org.opendolphin.core.comm.Command> commands, final javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    response.setHeader("Content-Type", "application/json");
    response.setCharacterEncoding("UTF-8");
    final java.lang.String jsonResponse = codec.encode(commands);
    response.getWriter().print(jsonResponse);
}
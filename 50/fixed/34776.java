public void init() throws javax.servlet.ServletException {
    servlet.FileLeaveServlet.MAPPER.enable(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
}
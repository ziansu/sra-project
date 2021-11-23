@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String data = request.getParameter("payload");
    com.servlet.DataBean dataBean = new com.servlet.DataBean();
    dataBean.setPayload(data);
    com.servlet.DataInsertionService.inserData(dataBean);
    javax.servlet.ServletOutputStream out = response.getOutputStream();
    out.write("Done".getBytes());
    out.flush();
}
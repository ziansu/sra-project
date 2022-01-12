public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    org.bit.linc.web.commons.EncodeType.setEncodingType(response);
    try {
        java.lang.String testData = "This test data";
        org.bit.linc.web.commons.ResponseUtil.returnData(response, new com.google.gson.Gson().toJson(testData));
    } catch (org.bit.linc.commons.exception.SysimpleException e) {
        e.printStackTrace();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
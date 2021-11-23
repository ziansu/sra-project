protected void response(javax.servlet.http.HttpServletResponse resp, io.yawp.commons.http.HttpResponse httpResponse) throws java.io.IOException {
    if (httpResponse == null) {
        new io.yawp.commons.http.JsonResponse("").execute(resp);
    }else {
        httpResponse.execute(resp);
    }
}
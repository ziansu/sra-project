@java.lang.Override
public void execute(com.baidu.palo.http.BaseRequest request, com.baidu.palo.http.BaseResponse response) {
    if (needCheckClientIsFe()) {
        try {
            checkFromValidFe(request, response);
        } catch (com.baidu.palo.http.meta.InvalidClientException e) {
            response.appendContent("invalid client host.");
            writeResponse(request, response, HttpResponseStatus.BAD_REQUEST);
            return ;
        }
    }
    super.execute(request, response);
}
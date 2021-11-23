@java.lang.Override
protected fr.ecp.sio.twitterAppEngine.model.Message doGet(javax.servlet.http.HttpServletRequest req) throws fr.ecp.sio.twitterAppEngine.api.ApiException, java.io.IOException, javax.servlet.ServletException {
    long id = fr.ecp.sio.twitterAppEngine.api.RequestUtils.requestToId(req);
    fr.ecp.sio.twitterAppEngine.model.Message message = fr.ecp.sio.twitterAppEngine.data.MessagesRepository.getMessage(id);
    return message;
}
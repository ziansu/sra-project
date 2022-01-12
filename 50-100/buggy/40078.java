@java.lang.Override
protected fr.ecp.sio.twitterAppEngine.model.User doGet(javax.servlet.http.HttpServletRequest req) throws fr.ecp.sio.twitterAppEngine.api.ApiException, java.io.IOException, javax.servlet.ServletException {
    fr.ecp.sio.twitterAppEngine.model.User user = null;
    java.lang.String pathInfo = req.getPathInfo().substring(1);
    if (pathInfo.equals("me")) {
        user = getAuthenticatedUser(req);
    }else {
        long id = java.lang.Long.parseLong(pathInfo);
        user = fr.ecp.sio.twitterAppEngine.data.UsersRepository.getUser(id);
    }
    return user;
}
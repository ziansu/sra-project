private static com.iutiao.model.User _obtainUser(java.util.Map<java.lang.String, java.lang.Object> params, java.lang.String url, com.iutiao.net.RequestOptions options, com.iutiao.model.RequestMethod method) throws com.iutiao.exception.APIConnectionException, com.iutiao.exception.APIException, com.iutiao.exception.AuthenticationException, com.iutiao.exception.InvalidRequestException {
    com.iutiao.model.User user = request(method, url, params, com.iutiao.model.User.class, options);
    com.iutiao.net.RequestOptions.getInstance().setToken(user.getToken());
    return user;
}
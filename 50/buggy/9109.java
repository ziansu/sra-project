@com.pratilipi.api.annotation.Get
public com.pratilipi.api.impl.userpratilipi.UserPratilipiApi.Response getUserPratilipi(com.pratilipi.api.impl.userpratilipi.UserPratilipiApi.GetRequest request) throws com.pratilipi.common.exception.UnexpectedServerException {
    com.pratilipi.data.client.UserPratilipiData userPratilipiData = com.pratilipi.data.util.UserPratilipiDataUtil.getUserPratilipi(com.pratilipi.filter.AccessTokenFilter.getAccessToken().getUserId(), request.pratilipiId);
    return new com.pratilipi.api.impl.userpratilipi.UserPratilipiApi.Response(userPratilipiData);
}
@com.thousandeyes.api.controller.RequestMapping(value = "/api/getFollowing", method = RequestMethod.GET)
public java.lang.Object getFollowing(@com.thousandeyes.api.controller.RequestParam(value = "userId")
long userId, @com.thousandeyes.api.controller.RequestParam(value = "token")
java.lang.String token, @com.thousandeyes.api.controller.RequestParam(required = false)
boolean expand) {
    if (!(validate(token)))
        return new com.thousandeyes.api.controller.ErrorResponse(javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED, ErrorResponse.UNAUTHORIZED);
    
    java.util.List<java.lang.Long> following = followerService.getFollowing(userId);
    if (expand) {
        java.util.List<com.thousandeyes.api.controller.User> detailedFollowing = userService.getUsers(following);
        return detailedFollowing;
    }else
        return following;
    
}
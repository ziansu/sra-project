public void invalidateUserCookie(javax.servlet.http.HttpServletResponse response, java.lang.String cookieName, com.epam.freelancer.database.model.UserEntity entity) {
    cookieManager.removeCookie(response, cookieName);
    if (entity != null)
        entity.setUuid(null);
    
}
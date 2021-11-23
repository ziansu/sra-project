public java.lang.String getActionUrl(final com.dotcms.contenttype.model.type.ContentType contentType, final com.liferay.portal.model.User user) {
    final javax.servlet.http.HttpServletRequest request = httpServletRequestThreadLocal.getRequest();
    return getActionUrl(request, contentType, user);
}
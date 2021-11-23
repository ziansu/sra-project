public java.lang.String[] getServletFilterNames() {
    try {
        return com.liferay.ide.eclipse.server.tomcat.core.util.LiferayTomcatUtil.getServletFilterNames(getPortalDir());
    } catch (java.lang.Exception e) {
        return new java.lang.String[0];
    }
}
@java.lang.Override
public java.lang.String handle(final com.ketayao.fensy.mvc.WebContext rc, final java.lang.Exception exception) {
    java.lang.String view = super.handle(rc, exception);
    if (org.apache.commons.lang3.StringUtils.equals(com.ketayao.system.SystemConfig.getConfig().get("blog.exception.email.switch"), "true")) {
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                com.ketayao.handler.EmailExceptionHandler.reportError(rc.getRequest(), exception);
            }
        });
        thread.start();
    }
    return view;
}
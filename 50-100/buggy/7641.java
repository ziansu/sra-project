protected void autoLoad() {
    if ((((_articleId) != null) || ((_classPK) != null)) && (com.liferay.mobile.screens.context.SessionContext.isLoggedIn())) {
        try {
            load();
        } catch (java.lang.Exception e) {
            onWebContentFailure(this, e);
        }
    }
}
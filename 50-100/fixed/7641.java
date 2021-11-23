protected void autoLoad() {
    if ((((_articleId) != null) || ((_classPK) != 0)) && (com.liferay.mobile.screens.context.SessionContext.isLoggedIn())) {
        try {
            load();
        } catch (java.lang.Exception e) {
            onWebContentFailure(this, e);
        }
    }
}
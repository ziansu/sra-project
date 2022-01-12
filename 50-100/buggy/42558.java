public static void setAppVisibilityForPackage(java.lang.String mPackageName, boolean mHideApp) {
    nickrout.lenslauncher.model.AppPersistent appPersistent = com.orm.query.Select.from(nickrout.lenslauncher.model.AppPersistent.class).where(com.orm.query.Condition.prop(com.orm.util.NamingHelper.toSQLNameDefault("mPackageName")).eq(mPackageName)).first();
    if (appPersistent != null) {
        appPersistent.setAppVisible(mHideApp);
        appPersistent.save();
    }else {
        nickrout.lenslauncher.model.AppPersistent newAppPersistent = new nickrout.lenslauncher.model.AppPersistent(mPackageName, nickrout.lenslauncher.model.AppPersistent.DEFAULT_OPEN_COUNT, nickrout.lenslauncher.model.AppPersistent.DEFAULT_ORDER_NUMBER, nickrout.lenslauncher.model.AppPersistent.DEFAULT_APP_VISIBILITY);
        newAppPersistent.save();
    }
}
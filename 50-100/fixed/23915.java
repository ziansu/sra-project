public void onClick(android.view.View v) {
    money.mezu.mezu.BaseNavDrawerActivity activity = ((money.mezu.mezu.BaseNavDrawerActivity) (mContext));
    switch (getLayoutPosition()) {
        case 0 :
            break;
        case 1 :
            activity.openSettings();
            break;
        case 2 :
            activity.logout();
            break;
        default :
            throw new java.lang.IllegalArgumentException();
    }
}
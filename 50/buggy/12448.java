public com.azzarcher.colormanager.ColorManager setToolbar(com.azzarcher.colormanager.Toolbar toolbar) throws com.azzarcher.colormanager.ColorManager.AlreadySetToolbarException {
    if ((mSupportToolbar) != null) {
        mToolbar = toolbar;
    }else {
        throw new com.azzarcher.colormanager.ColorManager.AlreadySetToolbarException();
    }
    return this;
}
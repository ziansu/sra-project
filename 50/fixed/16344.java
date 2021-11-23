private void initData() {
    if ((getIntent()) == null)
        return ;
    
    mCachedTranslations = getIntent().getParcelableArrayListExtra(Constant.INTENT_NOTE);
    mIsReciteMode = ((boolean) (com.clem.nhkradio.util.SPUtils.get(com.clem.nhkradio.constant.SharePreferenceConstant.SETTING_FILE, com.clem.nhkradio.constant.SharePreferenceConstant.MODE_SELECT, false)));
}
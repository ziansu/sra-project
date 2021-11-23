protected static void setTitlebarDisabled() {
    if ((org.ambientdynamix.core.BaseActivity.baseActivity) != null)
        org.ambientdynamix.core.BaseActivity.baseActivity.changeTitlebarState(Color.RED, org.ambientdynamix.core.BaseActivity.myRes.getString(R.string.dynamix_enable_toggle_off));
    
}
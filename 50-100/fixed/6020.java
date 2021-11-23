public void updateSettings() {
    btn_func_app = java.lang.System.getString(mContext.getContentResolver(), com.cyanogenmod.settings.device.KeyHandler.BTN_FUNC_APP);
    if ((btn_func_app) != null)
        btn_func_app = btn_func_app.trim();
    
    btn_func_app2 = java.lang.System.getString(mContext.getContentResolver(), com.cyanogenmod.settings.device.KeyHandler.BTN_FUNC_APP2);
    if ((btn_func_app2) != null)
        btn_func_app2 = btn_func_app2.trim();
    
}
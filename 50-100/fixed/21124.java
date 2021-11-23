private static void restoreDeviceInfo() {
    if ((com.cmcc.uiautomator.MiguUiAutomator.setOrNot) == 1)
        return ;
    
    java.lang.String json_device = com.cmcc.uiautomator.MiguUiAutomator.parseDeviceObj2Str();
    if (android.text.TextUtils.isEmpty(json_device))
        return ;
    
    if ((com.cmcc.uiautomator.MiguUiAutomator.userType) == 3) {
        com.cmcc.uiautomator.MiguUiAutomator.jedis.rpush((((com.cmcc.uiautomator.MiguUiAutomator.KEY_DATE_FORMAT.format(new java.util.Date())) + "_") + "imei"), json_device);
    }else {
        com.cmcc.uiautomator.MiguUiAutomator.jedis.set((((com.cmcc.uiautomator.MiguUiAutomator.userName) + "_") + (com.cmcc.uiautomator.MiguUiAutomator.redis_key)), json_device);
    }
}
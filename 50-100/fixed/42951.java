public static boolean isAccessibilityServiceActive(android.content.Context context) {
    java.lang.String settingValue = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES);
    java.lang.String[] activeAccessibilityServices = (settingValue != null) ? settingValue.split(":") : new java.lang.String[0];
    for (java.lang.String service : activeAccessibilityServices) {
        if (service.contains(simonlang.coastdove.core.CoastDoveService.class.getName()))
            return true;
        
    }
    return false;
}
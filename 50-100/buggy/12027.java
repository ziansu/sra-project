private void startServices() {
    customPreferencesService = context.registerService(org.eclipse.core.internal.preferences.exchange.IProductPreferencesService.class, new org.eclipse.core.internal.preferences.legacy.ProductPreferencesService(), new java.util.Hashtable<java.lang.String, java.lang.String>());
    if ((getBundle(CompatibilityHelper.PI_RUNTIME_COMPATIBILITY)) != null)
        legacyPreferencesService = context.registerService(org.eclipse.core.internal.preferences.exchange.ILegacyPreferences.class, new org.eclipse.core.internal.preferences.legacy.InitLegacyPreferences(), new java.util.Hashtable<java.lang.String, java.lang.String>());
    
}
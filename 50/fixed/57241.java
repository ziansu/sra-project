public int getItemsPerPage(android.content.Context c) {
    return java.lang.Integer.parseInt(android.preference.PreferenceManager.getDefaultSharedPreferences(c).getString(com.sphericalelephant.zeitgeistng.fragment.preference.PreferenceFacade.KEY_ITEMSPERPAGE, com.sphericalelephant.zeitgeistng.fragment.preference.PreferenceFacade.DEFAULT_ITEMSPERPAGE));
}
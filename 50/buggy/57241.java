public int getItemsPerPage(android.content.Context c) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(c).getInt(com.sphericalelephant.zeitgeistng.fragment.preference.PreferenceFacade.KEY_ITEMSPERPAGE, com.sphericalelephant.zeitgeistng.fragment.preference.PreferenceFacade.DEFAULT_ITEMSPERPAGE);
}
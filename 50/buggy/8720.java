@android.support.annotation.NonNull
public java.util.Set<java.lang.String> readFilteredCategories() {
    return getDefaultPrefs().getStringSet(com.blogspot.e_kanivets.moneytracker.controller.PreferenceController.KEY_FILTERED_CATEGORIES, new java.util.HashSet<java.lang.String>());
}
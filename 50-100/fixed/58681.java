public void setPhysicalToolMarkerAttribute(java.lang.String physical_tool_id, int marker_id, java.lang.String attribute_id, java.lang.String value) {
    android.content.SharedPreferences preferences = AppGlobal.shared_preferences;
    preferences.edit().putString(((((physical_tool_id + "_") + marker_id) + "_") + attribute_id), value).commit();
}
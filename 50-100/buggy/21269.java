static void saveMessages(android.app.Activity activity, java.util.ArrayList<java.lang.String> messages) {
    android.content.SharedPreferences preferences = activity.getPreferences(Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = preferences.edit();
    java.util.Set<java.lang.String> messageSet = preferences.getStringSet("messages", new java.util.HashSet<java.lang.String>());
    editor.clear();
    messageSet.clear();
    messageSet.addAll(messages);
    editor.putStringSet("messages", messageSet);
    editor.apply();
}
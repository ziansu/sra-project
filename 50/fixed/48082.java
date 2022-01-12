public static com.donare.app.utils.Preferences getInstance(android.content.Context context) {
    return (com.donare.app.utils.Preferences.instance) == null ? com.donare.app.utils.Preferences.instance = new com.donare.app.utils.Preferences(context) : com.donare.app.utils.Preferences.instance;
}
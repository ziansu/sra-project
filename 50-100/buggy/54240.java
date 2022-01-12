public void setStringList(final java.lang.String key, final java.util.ArrayList<java.lang.String> value) {
    com.Ben12345rocks.AdvancedCore.AdvancedCoreHook.getInstance().debug(((("Setting " + key) + " to ") + value));
    java.lang.String str = "";
    for (int i = 0; i < (value.size()); i++) {
        if (i != 0) {
            str += ",";
        }
        str += value.get(i);
    }
    setString(key, str);
}
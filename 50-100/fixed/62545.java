public void removeTranslations(java.util.ArrayList<java.lang.String> translations) {
    if ((getLocaleFile()) == null) {
        return ;
    }
    boolean edited = false;
    for (java.lang.String key : translations) {
        if (!(getLocaleFile().exists(key))) {
            continue;
        }
        getLocaleFile().remove(key);
        edited = true;
    }
    if (edited) {
        getLocaleFile().save();
        load();
    }
}
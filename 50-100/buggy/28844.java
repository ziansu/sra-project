private static java.util.Locale resolveLocale(net.cattweasel.pokebot.object.User user) {
    java.util.Locale locale = null;
    if (((user != null) && ((user.getSettings()) != null)) && ((user.getSettings().get(ExtendedAttributes.USER_SETTINGS_LANGUAGE)) != null)) {
        if ("en".equalsIgnoreCase(user.getSettings().getString(ExtendedAttributes.USER_SETTINGS_LANGUAGE))) {
            locale = java.util.Locale.ENGLISH;
        }else {
            locale = java.util.Locale.GERMAN;
        }
    }
    return locale;
}
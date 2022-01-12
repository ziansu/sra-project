@java.lang.Override
public java.lang.String getMessage(com.onarandombox.MultiverseCore.localization.MultiverseMessage key, java.util.Locale locale) {
    try {
        maybeLoadLocale(locale);
    } catch (com.onarandombox.MultiverseCore.localization.LocalizationLoadingException e) {
        e.printStackTrace();
        return getMessage(key);
    }
    return messages.get(locale).get(key);
}
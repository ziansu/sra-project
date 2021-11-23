@java.lang.Override
public java.lang.String getMessage(com.onarandombox.MultiverseCore.localization.MultiverseMessage key) {
    if (!(isLocaleLoaded(com.onarandombox.MultiverseCore.localization.DEFAULT_LOCALE)))
        return key.getDefault();
    else
        return messages.get(locale).get(key);
    
}
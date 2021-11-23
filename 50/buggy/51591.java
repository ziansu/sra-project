private java.lang.String correct_locale(java.lang.String locale) {
    if (locale == "ru")
        locale = "Ru";
    
    if (locale == "en")
        locale = "En";
    
    return locale;
}
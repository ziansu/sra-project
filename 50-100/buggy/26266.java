protected final java.lang.String getLocale() {
    if ((locale) == null) {
        locale = this.getString("lang");
        if ((locale) == null) {
            locale = getCookie("lang");
            if ((locale) == null) {
                locale = Module.home.getLanguage();
            }
        }else {
            this.addCookie("lang", locale, ((int) ((org.giiwa.core.bean.X.AYEAR) / 1000)));
        }
    }
    return locale;
}
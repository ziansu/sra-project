public java.lang.String getIntroText() {
    if ((introText) != null) {
        return xssapi.filterHTML(introText);
    }
    return introText;
}
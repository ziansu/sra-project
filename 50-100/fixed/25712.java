protected void changeLanguageTo(java.lang.String lang) {
    if (lang.equals(language)) {
        return ;
    }
    English.setSelected("en".equals(lang));
    Deutsch.setSelected("de".equals(lang));
    Francais.setSelected("fr".equals(lang));
    language = lang;
    if ((activeAddon) != null) {
        Description.setText(activeAddon.getDescription(language));
    }
}
protected void changeLanguageTo(java.lang.String lang) {
    if (lang.equals(language)) {
        return ;
    }
    English.setSelected(lang.equals("en"));
    Deutsch.setSelected(lang.equals("de"));
    Francais.setSelected(lang.equals("fr"));
    language = lang;
    if ((activeAddon) != null) {
        Description.setText(activeAddon.getDescription(language));
    }
}
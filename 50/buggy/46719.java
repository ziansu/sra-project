public java.lang.String setLanguageToEnglish(javax.faces.event.ActionEvent event) throws java.io.IOException {
    locale = new java.util.Locale("en");
    return "index?backurl=actionUrl&id=actionId&faces-redirect=true";
}
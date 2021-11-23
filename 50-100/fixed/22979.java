public void onTextInput(java.lang.String content) {
    if (content == null)
        return ;
    
    if ("".equals(content)) {
        view.setTranslatedText(content, "");
        return ;
    }
    translatePreferences.setInputText(content);
    if ((view) != null) {
        view.detailsAreAvailable(false);
        view.isStarVisible(false);
    }
    translateText();
}
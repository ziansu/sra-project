public java.lang.String removeInitialFinalWhites(java.lang.String text) {
    java.lang.String textWOWhites = text;
    while ((textWOWhites.startsWith(" ")) || (textWOWhites.startsWith("\t")))
        textWOWhites = textWOWhites.substring(1);
    
    while ((textWOWhites.endsWith(" ")) || (textWOWhites.startsWith("\t")))
        textWOWhites = textWOWhites.substring(0, ((textWOWhites.length()) - 1));
    
    return textWOWhites;
}
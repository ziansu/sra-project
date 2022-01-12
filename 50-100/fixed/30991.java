public java.lang.String getTranslationsAsString() {
    java.lang.String result = "";
    for (com.waverunner.wordrunner.Translation translation : mTranslationsList) {
        if (!(translation.getTranslation().isEmpty()))
            result += "; " + (translation.getTranslation());
        
    }
    int l = result.length();
    if (l > 2)
        return result.substring(2, l);
    
    return result;
}
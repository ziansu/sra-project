public static java.lang.String cleanText(java.lang.String text) {
    java.lang.String cleanedText = "";
    cleanedText = com.bda.functions.Preprocessor.tokenizeURLs(text);
    cleanedText = com.bda.functions.Preprocessor.tokenizeEmailAdresses(cleanedText);
    cleanedText = com.bda.functions.Preprocessor.tokenizeNumericCharacters(cleanedText);
    cleanedText = com.bda.functions.Preprocessor.removeHTML(cleanedText);
    cleanedText = com.bda.functions.Preprocessor.removeNonAlphanumericCharacters(cleanedText);
    cleanedText = com.bda.functions.Preprocessor.removeSpecialCharacters(cleanedText);
    return cleanedText.toLowerCase();
}
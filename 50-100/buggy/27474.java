private boolean ValidatePrompt(java.lang.String prompt) {
    if (prompt.isEmpty())
        return false;
    
    if ((prompt.length()) != (ONE_LETTER)) {
        return false;
    }else {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("[^a-zA-Z]");
        java.util.regex.Matcher matcher = pattern.matcher(prompt);
        return !(matcher.find());
    }
}
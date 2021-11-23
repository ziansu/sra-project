private java.lang.String listValues(java.lang.String word) {
    java.lang.String result = "";
    java.lang.String[] tokens = word.split(",|;");
    if ((tokens.length) > 1) {
        for (int i = 0; i < (tokens.length); i++) {
            result += (tokens[i]) + ',';
        }
        result = result.substring(0, ((result.length()) - 1));
    }else
        result = word;
    
    return result;
}
public java.lang.String getBestSuggestion(java.lang.String typed) {
    if ((typed == null) || ((typed.length()) == 0))
        return null;
    
    for (java.lang.String keyword : keywords) {
        if (keyword.startsWith(typed))
            return keyword;
        
    }
    return null;
}
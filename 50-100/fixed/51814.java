public java.lang.String generateKeywords() {
    java.lang.String[] words = this.content.replaceAll(com.pratilipi.common.util.PratilipiContentUtil.nonKeywordsPattern, " ").split("\\s+(\\w\\s+)*");
    java.util.Set<java.lang.String> wordSet = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList(words));
    words = wordSet.toArray(new java.lang.String[wordSet.size()]);
    java.lang.String keywords = "";
    for (java.lang.String word : words)
        keywords = (keywords + word) + " ";
    
    return keywords.trim();
}
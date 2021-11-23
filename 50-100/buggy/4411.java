java.util.List findVerse(java.lang.String input) {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\[(.*?)\\]", java.util.regex.Pattern.DOTALL);
    java.util.regex.Matcher matcher = pattern.matcher(input);
    java.util.List verses = new java.util.ArrayList();
    while (matcher.find()) {
        java.lang.System.out.println(matcher.group(1));
        verses.add(matcher.group(1));
    } 
    return verses;
}
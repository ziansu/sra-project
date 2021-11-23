public void addTimeKeyword(java.lang.String key, java.lang.String value) {
    java.lang.System.out.println((key + value));
    if (!(com.github.TimeComponent.timeExpressionString.contains(value))) {
        com.github.TimeComponent.timeExpressionString = ((com.github.TimeComponent.timeExpressionString) + value) + " ";
        java.lang.System.out.println(("TES" + (com.github.TimeComponent.timeExpressionString)));
    }
    java.util.ArrayList<java.lang.String> keywordList = com.github.TimeComponent.timeKeywords.get(key);
    keywordList.add(value);
}
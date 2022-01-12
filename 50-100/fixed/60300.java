public void addTimeKeyword(java.lang.String key, java.lang.String value) {
    if (!(com.github.TimeComponent.timeExpressionString.contains(value))) {
        com.github.TimeComponent.timeExpressionString = ((com.github.TimeComponent.timeExpressionString) + value) + " ";
    }
    com.github.TimeComponent.timeKeywords.get(key).add(value);
}
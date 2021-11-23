public static java.lang.String underscoreToCamelCase(java.lang.String wordConstruct) {
    java.lang.String[] words = wordConstruct.split("_");
    java.lang.String camelCaseWordConstruct = "";
    for (java.lang.String word : words) {
        if (!(camelCaseWordConstruct.equals("")))
            camelCaseWordConstruct += (word.substring(0, 1).toUpperCase()) + (word.substring(1));
        else
            camelCaseWordConstruct += word;
        
    }
    return camelCaseWordConstruct;
}
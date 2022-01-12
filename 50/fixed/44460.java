private java.lang.String pinyin(java.lang.String input) {
    java.lang.String pinyin = input.substring(1, ((input.length()) - 1)).replaceAll("\"", "").replaceAll(",", "");
    return pinyin;
}
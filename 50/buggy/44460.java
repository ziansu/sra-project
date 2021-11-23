private java.lang.String pinyin(java.lang.String input) {
    java.lang.String pinyin = input.substring(1, input.length()).replaceAll("\"", "").replaceAll(",", "");
    return pinyin;
}
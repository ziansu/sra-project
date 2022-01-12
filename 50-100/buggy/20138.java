public static java.util.List<java.lang.String> rightCombinations(java.lang.String string, int right) {
    java.util.List<java.lang.String> result = new java.util.ArrayList<>();
    while ((string.charAt(right)) == (string.charAt((right + 1)))) {
        result.add(string.substring(right, (right + 2)));
        right++;
    } 
    return result;
}
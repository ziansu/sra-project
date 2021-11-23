private java.util.List<java.lang.String> convertToPattern(java.lang.String input) {
    if (input == null)
        return new java.util.ArrayList<java.lang.String>();
    
    java.util.ArrayList<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    java.util.List<java.lang.String> permutations = repeatedVowelSequence(input.toCharArray(), 0, new java.util.ArrayList<java.lang.String>());
    for (java.lang.String temp : permutations) {
        result.add(generalizeVowels(temp));
    }
    return result;
}
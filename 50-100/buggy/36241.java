public static java.util.Map<luxoft.Word, java.lang.Integer> findSetOfVowels(java.util.List<java.lang.String> words) {
    java.util.Map<luxoft.Word, java.lang.Integer> setOfVowelsWithQuantity = new java.util.LinkedHashMap<luxoft.Word, java.lang.Integer>();
    java.util.Set<java.lang.Character> englishVowels = luxoft.VowelsParser.createSetOfVowels();
    for (java.lang.String word : words) {
        luxoft.VowelsParser.calculateVowelsQuantity(setOfVowelsWithQuantity, word, englishVowels);
    }
    return setOfVowelsWithQuantity;
}
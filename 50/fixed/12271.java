public static java.util.Set<java.lang.String> getAllKanjiFromRadicalList(java.util.List<com.example.x.androidkanjilookup.RadicalLookup.Radical> radicalList) {
    java.util.HashSet<java.lang.String> output = new java.util.HashSet<>();
    for (com.example.x.androidkanjilookup.RadicalLookup.Radical r : radicalList)
        output.addAll(r.relatedKanji);
    
    return output;
}
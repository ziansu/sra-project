public static java.util.List<com.example.x.androidkanjilookup.RadicalLookup.Radical> getRadicalsFromEnglishString(java.lang.String englishString) throws java.lang.Exception {
    java.util.List<com.example.x.androidkanjilookup.RadicalLookup.Radical> output = new java.util.ArrayList<com.example.x.androidkanjilookup.RadicalLookup.Radical>();
    for (com.example.x.androidkanjilookup.RadicalLookup.Radical r : com.example.x.androidkanjilookup.RadicalLookup.radicalsDb.values()) {
        if (r.description.contains(englishString))
            output.add(r);
        
    }
    return output;
}
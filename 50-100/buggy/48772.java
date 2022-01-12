public void processText(java.lang.String text) {
    java.lang.String[] array = text.replaceAll("\\pP", " ").toLowerCase().split("\\s+");
    for (int i = 0; i < (array.length); i++) {
        java.lang.String term = array[i];
        if (java.util.Arrays.asList(stopWords).contains(term)) {
            continue;
        }
        incrementTermCount(term);
    }
}
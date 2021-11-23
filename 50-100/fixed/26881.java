public static void extractCategories(com.lexicon.model.Vocabulary vocabulary) {
    java.util.Set<java.lang.String> categories = new java.util.HashSet<java.lang.String>();
    if ((vocabulary.getWords()) != null) {
        for (com.lexicon.model.Word word : vocabulary.getWords()) {
            if ((word.getCategories()) != null) {
                for (java.lang.String category : word.getCategories()) {
                    categories.add(category);
                }
            }
        }
    }
    vocabulary.setCategories(categories);
}
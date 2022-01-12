private static java.util.ArrayList<java.lang.String> getQuery(java.util.Scanner reader, java.lang.String[] stopWords, org.tartarus.snowball.SnowballStemmer stemmer) {
    java.lang.System.out.print("Enter query: ");
    java.lang.String query = reader.nextLine();
    java.util.ArrayList<java.lang.String> tokens = new java.util.ArrayList<>();
    tokens = processor.Preprocessor.tokenize(query);
    tokens = processor.Preprocessor.removeStopWords(stopWords, tokens);
    return processor.Processor.stemTerms(tokens, stemmer);
}
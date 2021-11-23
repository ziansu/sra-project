public static void main(java.lang.String[] args) throws com.dreamproduction.lsa.WrongDimensionException {
    com.dreamproduction.lsa.LSA lsa = new com.dreamproduction.lsa.LSA(new com.dreamproduction.lsa.TxtReader().loadFile(new java.io.File("src/main/resources/test-docs.txt")));
    java.util.HashMap<java.lang.String, double[]> words = lsa.getWordsResultMap();
    java.util.HashMap<java.lang.String, double[]> docs = lsa.getDocsResultMap();
    com.dreamproduction.tests.TempTest.print(words);
    java.lang.System.out.println("====================================================");
    com.dreamproduction.tests.TempTest.print(docs);
}
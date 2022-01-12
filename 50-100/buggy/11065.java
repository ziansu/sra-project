public static void main(java.lang.String[] args) {
    com.dreamproduction.tests.LsaTest.data = new java.util.ArrayList<>();
    com.dreamproduction.tests.LsaTest.data.add("привет");
    com.dreamproduction.tests.LsaTest.data.add("привет");
    com.dreamproduction.lsa.LSA lsa = null;
    try {
        lsa = new com.dreamproduction.lsa.LSA(com.dreamproduction.tests.LsaTest.data, 2);
    } catch (com.dreamproduction.lsa.WrongDimensionException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(lsa.getWordsResultMap());
}
private com.dreamproduction.lsa.LSA getLSA() {
    java.util.List<com.dreamproduction.algorithm.QuestionModel> questions = questionService.getAll();
    com.dreamproduction.lsa.LSA lsa = null;
    java.util.ArrayList<java.lang.String> keysList = new java.util.ArrayList<>();
    for (com.dreamproduction.algorithm.QuestionModel question : questions) {
        keysList.add(question.getQuestion());
    }
    try {
        lsa = new com.dreamproduction.lsa.LSA(keysList);
    } catch (com.dreamproduction.lsa.WrongDimensionException e) {
        e.printStackTrace();
    }
    return lsa;
}
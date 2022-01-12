private java.util.List<de.dhbw.persistence.Answer> getAnswersFromString(java.lang.String s) {
    java.util.List<de.dhbw.persistence.Answer> answers = new java.util.ArrayList<>();
    for (java.lang.String answerId : s.split(";")) {
        long id = java.lang.Long.parseLong(answerId);
        de.dhbw.persistence.Answer answer = DependecyKnowItAll.answerRepository.getAnswerById(id);
        answers.add(answer);
    }
    return answers;
}
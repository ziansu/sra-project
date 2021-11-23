public int getSequenceNumber(com.nab.skilltest.model.Exam exam, int questionId) {
    int sequenceNumber = -1;
    java.util.List<com.nab.skilltest.model.CandidateAnswer> myAnswer = exam.getMyAnswers();
    for (int i = 0; i < (myAnswer.size()); i++) {
        if ((myAnswer.get(i).getQuestionID()) == questionId) {
            sequenceNumber = i + 1;
            break;
        }
    }
    return sequenceNumber;
}
public java.lang.Double calcMean(com.policat.cat.temp_containers.OngoingQuiz ongoingQuiz) {
    java.lang.Integer sumScores = 0;
    java.util.List<com.policat.cat.temp_containers.QuestionResponse> correctResponses = getCorrectResponses(ongoingQuiz);
    for (com.policat.cat.temp_containers.QuestionResponse response : correctResponses) {
        sumScores += response.getQuestion().getScore();
    }
    return sumScores / ((double) (correctResponses.size()));
}
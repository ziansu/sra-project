public java.util.List<com.policat.cat.temp_containers.QuestionResponse> getCorrectResponses(com.policat.cat.temp_containers.OngoingQuiz ongoingQuiz) {
    java.util.List<com.policat.cat.temp_containers.QuestionResponse> correctResponses = new java.util.ArrayList<>();
    java.util.List<com.policat.cat.temp_containers.QuestionResponse> responses = ongoingQuiz.getQuestionsResponses();
    for (com.policat.cat.temp_containers.QuestionResponse response : responses) {
        if (response.isCorrect()) {
            correctResponses.add(response);
        }
    }
    return correctResponses;
}
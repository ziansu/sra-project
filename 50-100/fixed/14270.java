public void uploadAikenFile() throws com.revature.aes.exception.AikenSyntaxException, com.revature.aes.exception.InvalidFileTypeException, java.io.IOException {
    aikenParser.parseFile(file);
    java.util.HashMap<com.revature.aes.beans.Question, java.util.ArrayList<com.revature.aes.beans.Option>> questionsMap = ((java.util.HashMap<com.revature.aes.beans.Question, java.util.ArrayList<com.revature.aes.beans.Option>>) (aikenParser.getQuestionsMap()));
    for (com.revature.aes.beans.Question q : questionsMap.keySet()) {
        q.setMultiChoice(questionsMap.get(q));
        service.addQuestion(q);
    }
}
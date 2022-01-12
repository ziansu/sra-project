public void uploadAikenFile() {
    try {
        aikenParser.parseFile(file);
    } catch (com.revature.aes.exception.InvalidFileTypeException | com.revature.aes.exception.AikenSyntaxException e) {
        e.printStackTrace();
    }
    java.util.HashMap<com.revature.aes.beans.Question, java.util.ArrayList<com.revature.aes.beans.Option>> questionsMap = ((java.util.HashMap<com.revature.aes.beans.Question, java.util.ArrayList<com.revature.aes.beans.Option>>) (aikenParser.getQuestionsMap()));
    for (com.revature.aes.beans.Question q : questionsMap.keySet()) {
        q.setMultiChoice(questionsMap.get(q));
        service.addQuestion(q);
    }
}
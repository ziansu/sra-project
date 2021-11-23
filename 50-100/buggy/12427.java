public boolean getAnswerByQuestion(java.lang.String questionID) {
    int answerindex = 0;
    for (expert_system.Entry<java.lang.String, expert_system.Question> elements : ruleMap.entrySet()) {
        if (elements.getKey().contains(questionID)) {
            return ((boolean) (answerCollection.toArray()[answerindex]));
        }
        answerindex++;
    }
    return false;
}
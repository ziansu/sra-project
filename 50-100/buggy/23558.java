public boolean getAnswerByQuestion(java.lang.String questionID) {
    for (int i = 0; i < (ruleMap.size()); i++) {
        if (ruleMap.get(ruleMap.keySet().toArray()[i]).contains(quastionID));
        {
            return answerCollection[i];
        }
    }
}
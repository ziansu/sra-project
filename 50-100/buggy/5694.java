public java.util.List<de.thm.arsnova.entities.Question> getQuestionsBySortOrder(de.thm.arsnova.entities.SortOrder sortOrder, boolean onlyActive) {
    java.util.List<de.thm.arsnova.entities.Question> questions = new java.util.ArrayList<de.thm.arsnova.entities.Question>();
    java.lang.String[] questionIds = sortOrder.getSortOrder();
    for (java.lang.String t : questionIds) {
        de.thm.arsnova.entities.Question tempQuestion = getQuestion(t);
        if (onlyActive) {
            if (tempQuestion.isActive()) {
                questions.add(tempQuestion);
            }
        }else {
            questions.add(tempQuestion);
        }
    }
}
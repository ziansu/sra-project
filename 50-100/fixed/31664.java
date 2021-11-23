public static com.teamamerica.mathhelper.models.Question getQuestion() {
    if ((com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator.maxQuestions) == 0) {
        return null;
    }
    if ((com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator.counter) >= (com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator.maxQuestions)) {
        com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator.counter = 0;
    }
    return com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator.questions.get(((com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator.counter)++));
}
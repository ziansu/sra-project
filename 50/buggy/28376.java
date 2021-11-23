public static com.matsschade.semanticquizapp.Objects.QuestionTemplate getRandomQuestionTemplate(int categoryID) {
    int arraySize = 3;
    int randomNumber = ((int) ((java.lang.Math.random()) * arraySize));
    return com.matsschade.semanticquizapp.Objects.QuestionTemplates.queries[categoryID][0];
}
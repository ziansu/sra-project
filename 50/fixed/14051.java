protected boolean isQuizLastQuestion() {
    return (mQuizQuestionList.size()) <= (mQuizModel.progress);
}
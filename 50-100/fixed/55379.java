public void next(android.view.View view) {
    (actualIndexQuestion)++;
    if ((actualIndexQuestion) >= (questions.size())) {
        this.finish(null);
    }else {
        actualQuestion = questions.get(actualIndexQuestion);
        this.loadQuestion();
    }
}
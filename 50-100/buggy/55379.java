public void next(android.view.View view) {
    if ((actualIndexQuestion) >= (questions.size())) {
        this.finish(null);
    }else {
        (actualIndexQuestion)++;
        actualQuestion = questions.get(actualIndexQuestion);
        this.loadQuestion();
    }
}
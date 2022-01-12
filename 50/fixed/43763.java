public void showQuestion() {
    android.util.Log.e(rocks.throw20.funwithcountries.MainActivity.LOG_TAG, ("showQuestion " + true));
    rocks.throw20.funwithcountries.Question newQuestions = new rocks.throw20.funwithcountries.Question(this);
    newQuestions.getQuestion("", new java.lang.String[]{  });
}
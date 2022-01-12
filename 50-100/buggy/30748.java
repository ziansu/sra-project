protected void prepareTrueFalseModelBank() {
    _mQuestionBank = new com.bignerdranch.geoquiz.model.TrueFalseModel[]{ new com.bignerdranch.geoquiz.model.TrueFalseModel(R.string.question_oceans, true) , new com.bignerdranch.geoquiz.model.TrueFalseModel(R.string.question_africa, false) , new com.bignerdranch.geoquiz.model.TrueFalseModel(R.string.question_americas, false) , new com.bignerdranch.geoquiz.model.TrueFalseModel(R.string.question_asia, true) , new com.bignerdranch.geoquiz.model.TrueFalseModel(R.string.question_mideast, true) };
    _mCurrentIndex = 0;
}
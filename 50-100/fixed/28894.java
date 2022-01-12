private void saveViewData(android.os.Bundle instanceState) {
    instanceState.putString(com.matteoveroni.wordsremember.quizgame.view.QuizGameActivity.LBL_QUESTION_KEY, lbl_question.getText().toString());
    instanceState.putString(com.matteoveroni.wordsremember.quizgame.view.QuizGameActivity.LBL_QUESTION_VOCABLE_KEY, lbl_question_vocable.getText().toString());
    instanceState.putString(com.matteoveroni.wordsremember.quizgame.view.QuizGameActivity.TXT_ANSWER_KEY, txt_answer.getText().toString());
    instanceState.putLong(com.matteoveroni.wordsremember.quizgame.view.QuizGameActivity.QUIZ_GAME_TIMER_KEY, quizGameTimer.getMillisRemaining());
}
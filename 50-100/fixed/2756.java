@java.lang.Override
public void onClick(android.view.View view) {
    if ((ro.quiz.QuizActivity.questionArray.length) <= (ro.quiz.QuizActivity.count)) {
        return ;
    }
    switch (view.getId()) {
        case R.id.button_quiz_A :
            checkAnswer("a");
            break;
        case R.id.button_quiz_B :
            checkAnswer("b");
            break;
        case R.id.button_quiz_C :
            checkAnswer("c");
            break;
    }
}
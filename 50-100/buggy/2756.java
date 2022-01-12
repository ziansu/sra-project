@java.lang.Override
public void onClick(android.view.View view) {
    if ((ro.quiz.QuizActivity.questionArray.length) <= (ro.quiz.QuizActivity.count)) {
        android.widget.Toast.makeText(context, java.lang.String.format(getString(R.string.final_message), ro.quiz.QuizActivity.scorCorect), Toast.LENGTH_SHORT).show();
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
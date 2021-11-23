@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.LinearLayout answerLayout = ((android.widget.LinearLayout) (findViewById(R.id.lAnswerLayout)));
    if (!(((android.widget.EditText) (answerLayout.getChildAt(((answerLayout.getChildCount()) - 1)))).getText().toString().equals("")))
        AddAnswer();
    
}
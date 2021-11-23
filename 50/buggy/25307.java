@java.lang.Override
public void run() {
    QuestionTextView.startAnimation(fadeOut);
    QuestionTextView.setVisibility(View.INVISIBLE);
    setCorrectButtons();
}
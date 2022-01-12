private void fixTextviewLayoutSize() {
    android.widget.RelativeLayout ll_a = ((android.widget.RelativeLayout) (findViewById(R.id.answer_selector)));
    tv_questionIn.setText("TEST\nTEST\nTEST\nTEST\nTEST");
    tv_questionOut.setText("TEST\nTEST\nTEST\nTEST\nTEST");
    h = tv_questionIn.getHeight();
    findViewById(R.id.rl_question_container).getLayoutParams().height = h;
    findViewById(R.id.rl_question_container).requestLayout();
    tv_questionIn.requestLayout();
    tv_questionIn.setText("TEST\nTEST\nTEST\nTEST\nTEST");
    tv_questionOut.requestLayout();
    tv_questionOut.setText("TEST\nTEST\nTEST\nTEST\nTEST");
}
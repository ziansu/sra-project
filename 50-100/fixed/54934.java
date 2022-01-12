private void slideQuestionOut() {
    tv_questionOut.setX(tv_questionIn.getX());
    tv_questionOut.setText(tv_questionIn.getText());
    tv_questionOut.setVisibility(View.VISIBLE);
    tv_questionOut.animate().translationX((-(displayWidth)));
}
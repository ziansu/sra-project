private void slideQuestionOut() {
    tv_questionOut.setX(tv_questionIn.getX());
    tv_questionOut.setText(tv_questionIn.getText());
    tv_questionOut.setVisibility(View.VISIBLE);
    tv_questionOut.animate().translationX((-(displayWidth)));
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            tv_questionOut.setVisibility(View.GONE);
        }
    }, 600);
}
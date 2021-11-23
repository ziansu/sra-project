private void goPlayAgain(float touchX, float touchY) {
    com.simpsonstrial2.views.CircularTransition transition = new com.simpsonstrial2.views.CircularTransition(this, findViewById(R.id.RootLayout), touchX, touchY);
    transition.start(new android.animation.AnimatorListenerAdapter() {
        @java.lang.Override
        public void onAnimationEnd(android.animation.Animator animation) {
            startActivity(com.simpsonstrial2.utils.IntentManager.getQuestionIntent(com.simpsonstrial2.activities.HighScoreActivity.this));
            finish();
        }
    });
}
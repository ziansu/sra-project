public void LaunchQuestionMode(final com.simpsonstrial2.enums.Difficulty difficulty, final com.simpsonstrial2.enums.GamePlayType gamePlayType, int touchX, int touchY) {
    com.simpsonstrial2.models.GameMode.newInstance(difficulty, gamePlayType);
    com.simpsonstrial2.views.CircularTransition transition = new com.simpsonstrial2.views.CircularTransition(this, root, touchX, touchY);
    transition.start(new android.animation.AnimatorListenerAdapter() {
        @java.lang.Override
        public void onAnimationEnd(android.animation.Animator animation) {
            startActivity(com.simpsonstrial2.utils.IntentManager.getQuestionIntent(com.simpsonstrial2.activities.MainMenuActivity.this));
        }
    });
}
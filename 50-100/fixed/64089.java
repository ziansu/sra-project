public void onBackPressed() {
    if (((isDelayFinish) && ((questionAnswerAdapter) != null)) && (!(questionAnswerAdapter.isShowAnswer()))) {
        showMessage(R.string.delay_backkey_message);
        isDelayFinish = false;
        new android.os.Handler().postDelayed(new java.lang.Runnable() {
            public void run() {
                isDelayFinish = true;
            }
        }, com.qhvv.englishforalllevel.control.QuestionActivityBase.BACK_KEY_DELAY_TIME);
    }else {
        this.finish();
    }
}
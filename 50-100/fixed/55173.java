@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode != (android.app.Activity.RESULT_OK)) {
        return ;
    }
    if (requestCode == (com.bignerdranch.android.geoquiz.QuizActivity.REQUEST_CODE_CHEAT)) {
        if (data == null) {
            return ;
        }else {
            isCheater = com.bignerdranch.android.geoquiz.CheatActivity.wasAnswerShown(data);
        }
    }
}
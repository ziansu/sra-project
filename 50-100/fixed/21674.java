@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode != (android.app.Activity.RESULT_OK)) {
        return ;
    }
    if (requestCode == (com.shahid.android.geoquiz.MainActivity.REQUEST_CODE_CHEAT)) {
        if (data == null) {
            return ;
        }
        mIsCheater = com.shahid.android.geoquiz.CheatActivity.wasAnsIsShown(data);
    }
}
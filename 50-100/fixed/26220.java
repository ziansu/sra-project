private boolean makeResult(java.lang.String code) {
    if ((code != null) && (!(code.isEmpty()))) {
        android.content.Intent result = new android.content.Intent();
        result.putExtra(com.sweetzpot.stravazpot.authenticaton.ui.StravaLoginActivity.RESULT_CODE, code);
        setResult(com.sweetzpot.stravazpot.authenticaton.ui.RESULT_OK, result);
        finish();
        return true;
    }
    finish();
    return false;
}
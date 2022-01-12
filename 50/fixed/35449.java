private void checkForResumedCalculating() {
    if ((!(android.text.TextUtils.isEmpty(answer))) && (android.text.TextUtils.isEmpty(equation))) {
        equation = equationHandler.handleResumedCalculating(equation, answer);
    }
}
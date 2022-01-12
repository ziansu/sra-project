@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        if (problemTitle.getText().toString().isEmpty()) {
            tilProblemTitle.setError(getString(R.string.problem_title_blank));
            sendProblemButton.setClickable(false);
        }
    }else {
        tilProblemTitle.setErrorEnabled(false);
        sendProblemButton.setClickable(true);
    }
}
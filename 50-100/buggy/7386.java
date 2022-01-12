@java.lang.Override
public void run() {
    if ((countDownCountainer) != null) {
        if ((counter) >= 0) {
            countDownCountainer.setVisibility(View.VISIBLE);
            countDownTextView.setText(java.lang.String.format(getResources().getString(R.string.count_down_text), counter));
            countDownProgressBar.setProgress(((com.wb.nextgen.fragment.ECVideoViewFragment.COUNT_DOWN_SECONDS) - (counter)));
        }else {
            countDownTextView.setText("");
            countDownCountainer.setVisibility(View.GONE);
        }
    }
}
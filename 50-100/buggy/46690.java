@java.lang.Override
public void onEndOfSpeech() {
    android.util.Log.e(tag, "onEndOfSpeech()");
    android.widget.TextView commandResultTextView = ((android.widget.TextView) (this.activity.findViewById(this.resultTextViewId)));
    commandResultTextView.setText(R.string.please_wait_label);
    this.restartSpeechListener();
}
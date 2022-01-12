@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_log);
    consoleEditText = ((android.widget.EditText) (findViewById(R.id.consoleEditText)));
    openscience.crowdsource.video.experiments.AppLogger.updateTextView(consoleEditText);
    openscience.crowdsource.video.experiments.MainActivity.setTaskBarColored(this);
    new openscience.crowdsource.video.experiments.LogActivity.RemoteCallTask().execute("");
}
@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.step_activity);
    android.content.Intent intentThatStartedThisActivity = getIntent();
    if (intentThatStartedThisActivity != null) {
        if (intentThatStartedThisActivity.hasExtra("step")) {
        }
        if (intentThatStartedThisActivity.hasExtra("receipe_name")) {
            android.widget.TextView recepeiName = ((android.widget.TextView) (findViewById(R.id.step_receipe_name)));
            recepeiName.setText(intentThatStartedThisActivity.getStringExtra("receipe_name"));
        }
    }
}
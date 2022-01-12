@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_result);
    per = getIntent().getIntExtra("result", 50);
    android.widget.Toast.makeText(getApplicationContext(), ("result ac" + (per)), Toast.LENGTH_LONG).show();
    arcProgress = ((com.github.lzyzsd.circleprogress.ArcProgress) (findViewById(R.id.arc_progress)));
    arcProgress.setProgress(per);
}
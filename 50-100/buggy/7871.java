@java.lang.Override
public void onResume(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    number = 0;
    sent = false;
    com.appbackr.android.tracker.demo.Tracker.postData(this.getApplicationContext(), "".getApplicationContext().getPackageName(), "", "");
    setContentView(R.layout.main);
    final android.widget.TextView textViewToChange = ((android.widget.TextView) (findViewById(R.id.count)));
    textViewToChange.setText(number.toString());
}
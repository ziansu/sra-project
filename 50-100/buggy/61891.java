@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.example.suhasamireddy.turtlemap.MainActivity.txt = ((android.widget.TextView) (findViewById(R.id.textView)));
    android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
    android.os.StrictMode.setThreadPolicy(policy);
    new com.example.suhasamireddy.turtlemap.MapTask().execute(null, null, null);
}
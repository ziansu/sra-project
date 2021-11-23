@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.Button start = ((android.widget.Button) (findViewById(R.id.start)));
    com.bolex.androidhookstartactivity.AMSHook.AMSHookUtil.hookStartActivity(com.bolex.androidhookstartactivity.OtherActivity.class, com.bolex.androidhookstartactivity.HostActivity.class);
    start.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.content.Intent intent = new android.content.Intent(com.bolex.androidhookstartactivity.MainActivity.this, com.bolex.androidhookstartactivity.OtherActivity.class);
            startActivity(intent);
        }
    });
}
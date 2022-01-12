@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.util.Log.d("SAMPLE: ", "Here is your example tag that displays when the application starts");
    android.widget.Button B = ((android.widget.Button) (findViewById(R.id.buttonMain)));
    B.setOnClickListener(new android.view.View.OnClickListener() {
        public void onClick(android.view.View v) {
            goToSecondActivity();
        }
    });
}
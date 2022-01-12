@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_welcome);
    user = ((android.widget.EditText) (findViewById(R.id.user)));
    android.widget.Button submit = ((android.widget.Button) (findViewById(R.id.sign_in_button)));
    if (submit != null) {
        submit.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                login();
            }
        });
    }
}
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.setContentView(R.layout.login);
    this.setResult(Constants.ACTIVITY_INTERRUPTED);
    android.widget.Button logIn = ((android.widget.Button) (this.findViewById(R.id.log_in)));
    logIn.setOnClickListener(this);
    this.result = ((android.widget.TextView) (this.findViewById(R.id.result)));
}
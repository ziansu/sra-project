@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initiateButtons();
    setContentView(R.layout.activity_stop_error);
    android.widget.Toast toast = android.widget.Toast.makeText(this.getApplicationContext(), "STOP STOP STOP!!!", Toast.LENGTH_LONG);
    toast.show();
}
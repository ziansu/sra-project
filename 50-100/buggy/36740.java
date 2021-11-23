@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    this.textField = ((android.widget.EditText) (findViewById(R.id.textField)));
    com.app.sonny.calculator.MainActivity.textField.setFocusable(false);
    com.app.sonny.calculator.MainActivity.textField.setOnLongClickListener(new android.view.View.OnLongClickListener() {
        @java.lang.Override
        public boolean onLongClick(android.view.View v) {
            reset();
            return true;
        }
    });
}
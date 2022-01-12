@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    this.textField = ((android.widget.EditText) (findViewById(R.id.textField)));
    textField.setFocusable(false);
    textField.setOnLongClickListener(new android.view.View.OnLongClickListener() {
        @java.lang.Override
        public boolean onLongClick(android.view.View v) {
            reset();
            return true;
        }
    });
}
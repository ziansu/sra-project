@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.content_home_screen);
    record_button = ((android.widget.Button) (findViewById(R.id.record_button)));
    new_schedule = ((android.widget.Button) (findViewById(R.id.new_schedule)));
    record_button.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.support.design.widget.Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    });
}
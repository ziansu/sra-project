@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_menu);
    textView = ((android.widget.TextView) (findViewById(R.id.textViewUsername)));
    if ((mAuth.getCurrentUser()) != null) {
        textView.setText(mAuth.getCurrentUser().getDisplayName());
    }
}
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mInputEdit = ((android.widget.EditText) (findViewById(R.id.command_input_edit)));
    mResultBoard = ((android.widget.TextView) (findViewById(R.id.result_board)));
    mResultBoard.setMovementMethod(new android.text.method.ScrollingMovementMethod());
    findViewById(R.id.run_command).setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            runCommand();
        }
    });
}
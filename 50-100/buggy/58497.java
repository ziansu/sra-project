@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    decimalSeparator = getString(R.string.decimal_separator);
    mainDisplay = ((android.widget.TextView) (findViewById(R.id.main)));
    intermediateDisplay = ((android.widget.TextView) (findViewById(R.id.intermediate)));
    reset();
    initialValue = getString(R.string.initial_value);
    errorMessage = getString(R.string.error_message);
    android.view.ViewGroup buttons = ((android.view.ViewGroup) (findViewById(R.id.buttons)));
    setOnClickListenerGroup(buttons);
}
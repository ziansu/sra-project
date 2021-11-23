@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String input = inputTextView.getText().toString();
    if (isValidInput(input))
        stack.input(input);
    
    stack.evaluateOperation(((android.widget.Button) (view)).getText().toString());
    refreshStackDisplay();
}
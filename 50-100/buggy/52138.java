@java.lang.Override
public void backspacePressed() {
    if (textView.getText().toString().equalsIgnoreCase("wrong")) {
        textView.setText("");
    }else {
        textView.setText(textView.getText().subSequence(0, ((textView.getText().length()) - 1)));
    }
}
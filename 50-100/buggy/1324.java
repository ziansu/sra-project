@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    hideSoftKeyBoard();
    CUR_INPUT_COMMAND = processInput(commandText.getText().toString());
    if ((CUR_INPUT_COMMAND) != null) {
        if ((CUR_INPUT_COMMAND.inputMode) == (com.frrahat.quransimple.MainActivity.InputMode.MODE_VERSE)) {
            printAllAyahs();
        }else {
            printMatchedAyahs();
        }
    }
    return true;
}
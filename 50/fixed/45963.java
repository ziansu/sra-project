@java.lang.Override
public void run() {
    if ((savedState.offset) < (mEditText.getText().length()))
        mEditText.setSelection(savedState.offset);
    
}
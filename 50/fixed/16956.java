@java.lang.Override
public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
    final android.view.inputmethod.InputConnection ic = super.onCreateInputConnection(outAttrs);
    if (ic == null)
        return null;
    
    inputConnectionHacker = new com.jecelyin.editor.v2.widget.text.InputConnectionHacker(ic, this);
    return inputConnectionHacker;
}
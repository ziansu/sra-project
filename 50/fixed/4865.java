@java.lang.Override
public boolean performEditorAction(int editorAction) {
    boolean shouldConsume = false;
    switch (editorAction) {
        case android.view.inputmethod.EditorInfo.IME_ACTION_DONE :
            shouldConsume = true;
            mListener.onCVVEntryComplete();
    }
    return shouldConsume || (super.performEditorAction(editorAction));
}
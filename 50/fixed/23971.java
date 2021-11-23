@java.lang.Override
public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
    android.view.inputmethod.InputConnection c = super.onCreateInputConnection(outAttrs);
    if (c == null)
        return null;
    
    return new com.layer.atlas.utilities.views.EmptyDelEditText.EmptyDelInputConnection(c, true);
}
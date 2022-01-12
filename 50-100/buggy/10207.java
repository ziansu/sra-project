@java.lang.Override
public boolean onEditorAction(io.github.mthli.Ninja.Activity.TextView v, int actionId, io.github.mthli.Ninja.Activity.KeyEvent event) {
    if (((currentAlbumController) == null) || (!(actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)))) {
        return false;
    }
    java.lang.String query = inputBox.getText().toString().trim();
    if (query.isEmpty()) {
        io.github.mthli.Ninja.Activity.NinjaToast.show(this, R.string.toast_input_empty);
        return true;
    }
    updateAlbum(query);
    hideSoftInput(inputBox);
    return false;
}
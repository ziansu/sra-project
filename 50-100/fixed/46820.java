@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if ((((mode) == (com.seraphim.chips.ChipsView.Mode.ALL)) && (!(editText.getText().toString().isEmpty()))) && (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE))) {
        com.seraphim.chips.SimpleChipEntry entry = new com.seraphim.chips.SimpleChipEntry(editText.getText().toString(), null);
        editText.setText("");
        addChip(entry);
    }
    return true;
}
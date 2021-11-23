private void ValidateTextInput(java.lang.String s) {
    if ((s.length()) == 0) {
        com.github.bwindsor.pairlearnapp.DialogHelper.ShowOKDialog(this, R.string.dialog_string_empty_message, R.string.dialog_string_empty_title);
    }
    if (s.contains(",")) {
        com.github.bwindsor.pairlearnapp.DialogHelper.ShowOKDialog(this, R.string.dialog_string_contains_comma_message, R.string.dialog_string_contains_comma_title);
    }
}
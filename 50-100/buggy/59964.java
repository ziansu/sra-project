public void clearEditTexts(android.support.design.widget.TextInputEditText[] textInputEditTexts) {
    for (int i = 0; i < ((textInputEditTexts.length) - 1); i++) {
        if ((textInputEditTexts[i]) != null) {
            textInputEditTexts[i].getText().clear();
        }
    }
}
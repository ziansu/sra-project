private void checkForText(android.support.design.widget.TextInputEditText[] textInputEditTexts, java.util.List<java.lang.String> strings) {
    int i = 0;
    while (i <= ((com.tonykazanjian.codenamescompanion.UserPreferences.getCardNumber(getContext())) - 1)) {
        if (!(android.text.TextUtils.isEmpty(textInputEditTexts[i].getText().toString()))) {
            strings.add(textInputEditTexts[i].getText().toString());
        }
        i++;
    } 
}
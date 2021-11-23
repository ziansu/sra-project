private int weight() {
    if ((mWeightEditText.getText().toString().length()) > 0) {
        return java.lang.Integer.parseInt(mWeightEditText.getText().toString().trim());
    }
    return 0;
}
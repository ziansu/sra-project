private void next() {
    if ((index) == ((keys.size()) - 1)) {
        button.setText(getContext().getResources().getString(R.string.okString));
        invalidate();
    }else {
        (index)++;
        showHelp();
    }
}
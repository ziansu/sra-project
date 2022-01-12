public void onClickNumber(android.view.View v) {
    if (!(result.isEmpty())) {
        clear();
        updateScreen();
    }
    android.widget.Button b = ((android.widget.Button) (v));
    display += b.getText();
    updateScreen();
}
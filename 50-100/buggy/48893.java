public void onClickNumber(android.view.View v) {
    if ((result) != "") {
        clear();
        updateScreen();
    }
    android.widget.Button b = ((android.widget.Button) (v));
    display += b.getText();
    updateScreen();
}
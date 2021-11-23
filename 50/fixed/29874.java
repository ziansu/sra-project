public void onClick(android.view.View v) {
    Buttons.get(((v.getId()) + 1)).setText(java.lang.Integer.toString(hideTextArray[v.getId()]));
}
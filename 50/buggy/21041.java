public void navigationButtonOnClick(android.view.View v) {
    android.widget.Button button = ((android.widget.Button) (v));
    setContentView(R.layout.edit_page);
    editing = true;
    editPage.loadTimerValues();
}
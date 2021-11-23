@java.lang.Override
protected void onResume() {
    super.onResume();
    if (getIntent().hasExtra(EventView.PRESERVE_VIEW)) {
        addEventView(null);
    }
    _addItemPresenter.updateListText();
}
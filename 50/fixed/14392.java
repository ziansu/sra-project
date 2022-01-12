public void installContent() {
    int contentView = selectContentView();
    mWindow.setContentView(contentView);
    setupView();
}
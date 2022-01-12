private void closeSearch(final java.lang.Runnable onDone) {
    mSearchButton.setEnabled(false);
    hideEdit(((mSearchButton.getLeft()) - (mTitleLogo.getRight())), new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mSearchButton.setEnabled(true);
            onDone.run();
        }
    });
}
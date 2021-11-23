private void hideFooterView() {
    if ((mFooterView) != null) {
        mFooterView.setVisibility(View.INVISIBLE);
        mIsPullUpLoading = false;
        mFooterView.setPadding(0, 0, 0, (-(mFooterView.getHeight())));
    }
}
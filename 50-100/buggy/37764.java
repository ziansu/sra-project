private void exitMakingView() {
    mHistoryAdapter.rollbackOrigin();
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.emoge.app.emoge.model.PaletteMessage(com.emoge.app.emoge.ui.correction.Correcter.CORRECT_APPLY, 0));
    mHistoryAdapter.clearHistory();
    exitViews(mPaletteWindow);
    enterViews(mGalleryWindow);
    mSaveButton.setVisibility(View.GONE);
    mNextButton.setVisibility(View.VISIBLE);
}
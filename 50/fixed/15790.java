@java.lang.Override
public void extractIntentData() {
    if (getIntent().hasExtra(com.skillvo.android.views.PortFolioActivity.KEY_DATA_MODEL)) {
        mPagedDataModel = getIntent().getParcelableExtra(com.skillvo.android.views.PortFolioActivity.KEY_DATA_MODEL);
        portfolioViewModel.bindPagedDataModel(mPagedDataModel);
    }
}
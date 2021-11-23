public void setListData(java.util.List<by.evgen.android.apiclient.bo.Category> data) {
    if (data != null) {
        mContent = data;
        by.evgen.android.apiclient.fragment.DetailsFragment.Callbacks callbacks = getCallbacks();
        callbacks.onSetContents(data);
    }
}
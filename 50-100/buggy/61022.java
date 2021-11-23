@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if ((s.toString().compareTo("")) != 0) {
        imgHintSearch.setVisibility(View.GONE);
    }else {
        imgHintSearch.setVisibility(View.VISIBLE);
    }
    final java.util.List<gem.com.support_client.network.model.FeedbackBrief> filteredModelList = filter(getPresenter().getListData(), s.toString());
    getPresenter().getAdapter().animateTo(filteredModelList);
}
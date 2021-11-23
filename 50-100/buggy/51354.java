public void loadData() {
    if (com.ethan.morephone.utils.Utils.isNetworkAvailable(getActivity())) {
        mPresenter.clearData();
        mPresenter.loadCalls(getContext(), mPhoneNumber, 0);
    }else {
        android.widget.Toast.makeText(getContext(), getString(R.string.message_error_lost_internet), Toast.LENGTH_SHORT).show();
    }
}
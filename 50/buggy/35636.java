private void setWithoutInternetView() {
    mLoadingView.setVisibility(View.GONE);
    noInternetConnetionView.setVisibility(View.VISIBLE);
    com.mcp.smyrilline.util.AppUtils.withoutInternetConnectionView(getActivity(), getActivity().getIntent(), retryInternetBtn);
}
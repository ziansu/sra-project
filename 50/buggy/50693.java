@java.lang.Override
protected void onStartLoading() {
    if (!(movieList.isEmpty())) {
        deliverResult(movieList);
    }else {
        mLoadingIndicator.setVisibility(View.VISIBLE);
        forceLoad();
    }
}
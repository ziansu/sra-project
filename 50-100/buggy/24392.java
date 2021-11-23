@java.lang.Override
protected void onStopLoading() {
    progressBar.setVisibility(View.GONE);
    butterknife.ButterKnife.apply(radios, new butterknife.ButterKnife.Action<android.view.View>() {
        @java.lang.Override
        public void apply(android.view.View view, int index) {
            view.setEnabled(true);
        }
    });
}
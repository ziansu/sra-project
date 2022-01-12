@java.lang.Override
protected void onStartLoading() {
    progressBar.setVisibility(View.VISIBLE);
    butterknife.ButterKnife.apply(radios, new butterknife.ButterKnife.Action<android.view.View>() {
        @java.lang.Override
        public void apply(android.view.View view, int index) {
            view.setEnabled(false);
        }
    });
}
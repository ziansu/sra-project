public final void showProgressDialog(java.lang.String title, java.lang.String content, boolean horizontal) {
    pgdLoading = new com.afollestad.materialdialogs.MaterialDialog.Builder(this).theme(Theme.LIGHT).cancelable(false).progress(true, 0).progressIndeterminateStyle(horizontal).build();
    if (title != null) {
        pgdLoading.getTitleView().setText(title);
    }
    pgdLoading.setContent(content);
    pgdLoading.show();
}
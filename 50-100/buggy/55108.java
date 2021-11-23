@java.lang.Override
public void showFailBanner(java.lang.String msg) {
    com.example.daidaijie.syllabusapplication.util.SnackbarUtil.LongSnackbar(mSyllabusRootLayout, msg, SnackbarUtil.Alert).setAction("再次同步", new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            mSyllabusRefreshLayout.setRefreshing(true);
            mSyllabusFragmentPresenter.updateSyllabus();
        }
    }).show();
}
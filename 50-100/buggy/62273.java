private void init() {
    android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this, R.style.TranslucentFullScreen);
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(this);
    builder.setView(inflater.inflate(R.layout.dialog_progress_wait, null));
    mWaitDialog = builder.create();
    mLoginPresenter = new me.fallblank.weiworld.presenter.LoginPresenter(this, this, this, this);
}
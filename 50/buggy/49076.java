@java.lang.Override
public void resume() {
    android.util.Log.i(vn.tnc.tncframework.presenter.UserListPresenter.TAG, "resume");
    userListView.showLoading();
    userListView.hideRetry();
    getListUser();
}
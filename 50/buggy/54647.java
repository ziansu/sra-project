@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.naks.vk.presenter.NewsPagePresenterImpl.TAG, "onDestroy");
    view = null;
    interactor.onDestroy();
}
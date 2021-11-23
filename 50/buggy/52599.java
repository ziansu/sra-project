@java.lang.Override
@android.support.annotation.CallSuper
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d(com.nichesoftware.giftlist.views.BaseActivity.TAG, "onCreate");
    com.nichesoftware.giftlist.views.BaseActivity.setContentView(getContentView());
    initView();
    initPresenter();
}
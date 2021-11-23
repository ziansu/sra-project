@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mMvpDelegate.onCreate(com.rey.mvp.impl.MvpActivity.getPresenterCache(), com.rey.mvp.impl.MvpActivity.getViewStateCache(), savedInstanceState, mPresenterFactory, mViewStateFactory);
}
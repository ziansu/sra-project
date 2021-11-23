@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mActivity = getActivity();
    setMainTitleListener = ((com.xiaodong.dream.catcher.demo.express.OnSetMainTitleListener) (mActivity));
    setMainTitleListener.onSetMainTitle(R.string.express_title);
}
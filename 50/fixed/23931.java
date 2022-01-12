@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    com.xiaolei.easyfreamwork.utils.Log.d(TAG, ((this.getClass().getName()) + ":onActivityCreated"));
    onSetContentView();
    super.onActivityCreated(savedInstanceState);
}
@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    handler = new android.os.Handler();
    com.xiaolei.easyfreamwork.utils.Log.d(TAG, ((this.getClass().getName()) + ":onActivityCreated"));
    onSetContentView();
    super.onActivityCreated(savedInstanceState);
}
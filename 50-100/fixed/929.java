@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d(com.testcase.emuchat.views.fragments.ChatFragment.TAG, "onCreate");
    if ((commandCenter) == null)
        commandCenter = com.testcase.emuchat.CommandCenter.getInstance(getContext());
    
    chatItemList = new com.testcase.emuchat.views.widgets.MyRecyclerView.RVList<>();
    setRetainInstance(true);
}
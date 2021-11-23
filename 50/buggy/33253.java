@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    if (activity instanceof com.thejakeofink.mountainviewgirlscamp.InitialPageActivity) {
        ((com.thejakeofink.mountainviewgirlscamp.InitialPageActivity) (activity)).registerFragmentHandler(mHandler);
    }
}
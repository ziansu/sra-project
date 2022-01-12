@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {
        if ((getContext()) != null) {
            android.util.Log.i("VISIBLE", "REFRESHING");
            makeNetworkCall();
        }
    }else {
        android.util.Log.i("VISIBLE", "NO");
    }
}
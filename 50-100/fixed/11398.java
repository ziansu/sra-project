@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    activity = ((codemagnus.com.dealokav2.BaseTabActivity) (getActivity()));
    if ((activity.getSwitchCompat()) != null)
        activity.getSwitchCompat().setVisibility(View.VISIBLE);
    
    initPhoneDetails();
    getUserLastKnownLocation();
    activity.getToolBar().setTitle("Tower List");
}
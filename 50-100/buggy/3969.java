@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_master_detail_navigation_manager, container, false);
    mIsTablet = (view.findViewById(R.id.master_detail_container_master)) != null;
    mIsPortrait = (view.findViewById(R.id.master_detail_layout_main_portrait)) != null;
    android.util.Log.d(com.dmcapps.navigationfragment.manager.MasterDetailNavigationManagerFragment.TAG, ("Reported Tablet: " + (mIsTablet)));
    android.util.Log.d(com.dmcapps.navigationfragment.manager.MasterDetailNavigationManagerFragment.TAG, ("Reported Portrait: " + (mIsPortrait)));
    return view;
}
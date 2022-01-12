@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_friends_tab_requests, container, false);
    tabFriendRequestContext = getActivity();
    layoutFriendRequestList = ((android.widget.LinearLayout) (rootView.findViewById(R.id.layoutFriendRequestsList)));
    listFriendRequests.clear();
    retrieveFriendRequests();
    return rootView;
}
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_blackboard_overview, viewGroup, false);
    initViews(view);
    wipraktikum.informationwallandroidapp.Utils.NotificationHelper.getInstance().setOnNotificationReceiveListener(new wipraktikum.informationwallandroidapp.Utils.NotificationHelper.OnNotificationReceiveListener() {
        @java.lang.Override
        public void onNotificationReceive() {
            blackBoardExpandableListViewAdapter.notifyDataSetChanged();
        }
    });
    return view;
}
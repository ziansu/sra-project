@java.lang.Override
public com.augmentis.ayp.alarmclock.AlarmListFragment.AlarmHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(getActivity()).inflate(R.layout.item_list_card_alarm, parent, false);
    return new com.augmentis.ayp.alarmclock.AlarmListFragment.AlarmHolder(itemView);
}
@butterknife.OnClick(value = R.id.get_button)
public void onGetButtonClicked(android.view.View view) {
    android.util.Log.i(com.example.azvk.butterknife.Fragments.ButtonsFragment.TAG, "onGetButtonClicked");
    com.example.azvk.butterknife.EventList eventList = new com.example.azvk.butterknife.EventList();
    eventList.setResultCode(111);
    org.greenrobot.eventbus.EventBus.getDefault().post(eventList);
}
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    appData.set_userEventList(bl.getUserEvents(appData.get_userToken()));
    if (isChecked) {
    }else {
    }
}
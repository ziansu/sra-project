@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, final boolean isChecked) {
    int pos = ((java.lang.Integer) (buttonView.getTag()));
    NotificationManager.grpIds.add(notificationsGroupList.get(position).getId());
    int flag = (isChecked) ? 1 : 0;
    notificationsGroupList.get(pos).setActive(flag);
}
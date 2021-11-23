@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, final boolean isChecked) {
    int pos = ((java.lang.Integer) (buttonView.getTag()));
    if (isChecked) {
        NotificationManager.grpIds.add(notificationsGroupList.get(pos).getId());
        notificationsGroupList.get(pos).setActive(1);
    }else {
        notificationsGroupList.get(pos).setActive(0);
        NotificationManager.grpIds.remove(notificationsGroupList.get(pos).getId());
    }
}
@java.lang.Override
public void onGroupExpand(int groupPosition) {
    loadValuesNew(groupPosition);
    actualAlarm = groupPosition;
    if (groupPosition != (previousGroup))
        AlarmGroupView.collapseGroup(previousGroup);
    
    previousGroup = groupPosition;
    AlarmGroupView.invalidateViews();
}
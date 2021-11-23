@java.lang.Override
public void onGroupExpand(int groupPosition) {
    if (groupPosition != (previousGroup)) {
        if ((previousGroup) != (-1))
            AlarmGroupView.collapseGroup(previousGroup);
        
        previousGroup = groupPosition;
        actualAlarm = groupPosition;
    }
}
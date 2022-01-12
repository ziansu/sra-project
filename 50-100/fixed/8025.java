public void reorderToolbarContainer() {
    toolbarsContainer.removeAllViews();
    java.util.Collections.sort(com.example.root.myalarmclock.MainActivity.mAlarmList, new java.util.Comparator<com.example.root.myalarmclock.Alarm>() {
        @java.lang.Override
        public int compare(com.example.root.myalarmclock.Alarm r1, com.example.root.myalarmclock.Alarm r2) {
            return r1.getAlarmDate().compareTo(r2.getAlarmDate());
        }
    });
    for (int x = 0; x < (com.example.root.myalarmclock.MainActivity.mAlarmList.size()); x++) {
        toolbarsContainer.addView(com.example.root.myalarmclock.MainActivity.mAlarmList.get(x).getToolbar());
    }
}
@java.lang.Override
public void onGroupExpand(int groupPosition) {
    fforganizer.activities.Mainmenu.events_expanded[groupPosition] = true;
    getWindow().getDecorView().post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            adjustHeight();
        }
    });
}
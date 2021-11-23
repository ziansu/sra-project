private void doMyWork(android.content.Context context) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.paulvarry.intra42.notifications.NotificationsUtils.run(getBaseContext(), ((com.paulvarry.intra42.AppClass) (getApplication())));
        }
    }).start();
}
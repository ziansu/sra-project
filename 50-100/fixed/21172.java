void addNotification(final com.example.kemo.socializer.SocialAppGeneral.Notification notification) {
    if (!((getActivity()) == null)) {
        getActivity().runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                notificationAdapter.getNotifications().add(0, notification);
                notificationAdapter.notifyDataSetChanged();
            }
        });
    }else {
        notificationAdapter.getNotifications().add(0, notification);
    }
}
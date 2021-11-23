void addNotification(com.example.kemo.socializer.SocialAppGeneral.Notification... notifications) {
    for (com.example.kemo.socializer.SocialAppGeneral.Notification notification : notifications) {
        notificationAdapter.getNotifications().add(0, notification);
    }
    if (!((getActivity()) == null))
        getActivity().runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                notificationAdapter.notifyDataSetChanged();
            }
        });
    
}
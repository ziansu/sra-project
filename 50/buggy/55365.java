public void onTrigger(cz.raynet.raynetcrm.NotificationObj notificationObj) {
    if (notificationObj != null) {
        notificationObj.show();
        cz.raynet.raynetcrm.NotificationService.getInstance().recountScheduled();
    }
}
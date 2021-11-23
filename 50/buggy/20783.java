public void showTestNotification(java.lang.String title, java.lang.String serverTime, int prio) {
    manager.notify(new java.util.Random().nextInt(), getNotificationBuilder(title, serverTime, prio).build());
}
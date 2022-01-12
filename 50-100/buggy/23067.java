public void run() throws java.lang.Exception {
    for (int i = 0; i < (controller.NotificationController.NOTIFICATION_PAGES.length); i++) {
        java.lang.Runnable worker = new model.NotificationModel(controller.NotificationController.NOTIFICATION_PAGES[i]);
        executor.execute(worker);
    }
    executor.shutdown();
    while (!(executor.isTerminated())) {
    } 
}
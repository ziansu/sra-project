public void serviceTracking(uk.co.rossbeazley.trackmytrain.android.wear.TrainViewModel trainViewModel) {
    this.trainViewModel = trainViewModel;
    if (isNotifing) {
        for (uk.co.rossbeazley.trackmytrain.android.wear.notification.WearNotificationService.WearNotification presenter : notificationPresenters) {
            presenter.show(this.trainViewModel);
        }
    }
}
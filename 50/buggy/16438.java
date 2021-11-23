public static void cancel(hu.rycus.rpiomxremote.RemoteService service) {
    hu.rycus.rpiomxremote.ui.NotificationHelper.rsc.unbind(service);
    hu.rycus.rpiomxremote.ui.PlayerMediaReceiver.deactivate(service);
    service.stopForeground(true);
    hu.rycus.rpiomxremote.ui.NotificationHelper.builder = null;
    hu.rycus.rpiomxremote.ui.NotificationHelper.remoteViews = null;
    hu.rycus.rpiomxremote.ui.NotificationHelper.userCancelled = false;
}
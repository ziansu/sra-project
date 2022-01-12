public static void cancel(hu.rycus.rpiomxremote.RemoteService service) {
    hu.rycus.rpiomxremote.ui.NotificationHelper.rsc.unbind(service);
    service.stopForeground(true);
    hu.rycus.rpiomxremote.ui.NotificationHelper.userCancelled = false;
}
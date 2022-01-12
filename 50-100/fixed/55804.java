@java.lang.Override
public void run() {
    try {
        com.topicsbot.services.api.telegram.model.Updates result = telegramApiProvider.getUpdates(lastUpdateId);
        if ((result != null) && (!(result.isEmpty()))) {
            lastUpdateId = (result.getLastUpdateId()) + 1;
            updates.addAll(result.getUpdates());
        }
    } catch (java.lang.Exception ex) {
        com.topicsbot.services.api.telegram.daemons.GetUpdatesDaemon.logger.error(ex.getMessage(), ex);
    }
}
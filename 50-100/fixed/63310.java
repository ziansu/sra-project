public static void cancel(@play.data.binding.As(value = ",")
java.util.List<java.net.URI> ids) {
    try {
        for (java.net.URI id : ids) {
            util.BourneUtil.getViprClient().blockConsistencyGroups().migrationCancel(id, false);
        }
        flash.success(util.MessagesUtils.get(controllers.arrays.StorageGroups.CANCEL_MULTIPLE));
    } catch (java.lang.Exception e) {
        controllers.Common.flashException(e);
        controllers.arrays.StorageGroups.listAll();
    }
    controllers.arrays.StorageGroups.listAll();
}
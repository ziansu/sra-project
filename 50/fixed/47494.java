public static void cancelSync() {
    if ((dan.dit.whatsthat.image.ImageManager.SYNCING_TASK) != null) {
        dan.dit.whatsthat.image.ImageManager.SYNCING_TASK.mListener = null;
        dan.dit.whatsthat.image.ImageManager.SYNCING_TASK.cancel(true);
        dan.dit.whatsthat.image.ImageManager.SYNCING_TASK = null;
    }
}
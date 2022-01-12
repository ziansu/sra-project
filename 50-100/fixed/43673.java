public static void resetBucketsAndDeauthorize() {
    if ((org.wordpress.android.ui.notifications.utils.SimperiumUtils.mNotesBucket) != null) {
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.mNotesBucket.reset();
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.mNotesBucket = null;
    }
    if ((org.wordpress.android.ui.notifications.utils.SimperiumUtils.mMetaBucket) != null) {
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.mMetaBucket.reset();
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.mMetaBucket = null;
    }
    if ((org.wordpress.android.ui.notifications.utils.SimperiumUtils.mSimperium) != null) {
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.mSimperium.getUser().setStatus(User.Status.UNKNOWN);
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.mSimperium = null;
    }
}
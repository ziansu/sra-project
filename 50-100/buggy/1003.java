@java.lang.Override
public void onRefresh() {
    addStatusListener();
    de.ironjan.mensaupb.fragments.Bundle settingsBundle = new de.ironjan.mensaupb.fragments.Bundle();
    settingsBundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
    settingsBundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true);
    de.ironjan.mensaupb.fragments.ContentResolver.requestSync(mAccountCreator.getAccount(), AccountCreator.AUTHORITY, settingsBundle);
    LOGGER.debug("Sync requested.");
}
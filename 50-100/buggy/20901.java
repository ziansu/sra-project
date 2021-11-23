public static void syncImmediately(android.content.Context context) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true);
    bundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
    if (!(com.upenn.chriswang1990.sunshine.Utility.isNetworkAvailable(context))) {
        com.upenn.chriswang1990.sunshine.Utility.setLocationStatus(context, com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.LOCATION_STATUS_NO_NETWORK);
        return ;
    }
    android.content.ContentResolver.requestSync(com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.getSyncAccount(context), context.getString(R.string.content_authority), bundle);
}
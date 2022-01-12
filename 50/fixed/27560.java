@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    fetchLocationService = new com.intrepid.miniproject.madslacker.FetchLocationService(this, googleApiClient);
    android.content.Intent fetchLocationIntent = new android.content.Intent();
    fetchLocationService.onHandleIntent(fetchLocationIntent);
}
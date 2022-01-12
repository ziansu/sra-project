@java.lang.Override
public void onBeaconsDiscovered(com.estimote.sdk.Region region, java.util.List<com.estimote.sdk.Beacon> beacons) {
    android.util.Log.d(de.thm.mwdr.fmi2015shopapp.ScanBeacon.TAG, ("Ranged beacons: " + beacons));
    if (!(beacons.isEmpty())) {
        jsonObject = getBacons(beacons, jsonObject);
        android.content.Intent newIntent = new android.content.Intent(this, de.thm.mwdr.fmi2015shopapp.ChooseShop.class);
        android.os.Bundle extraBundle = new android.os.Bundle();
        extraBundle.putString("JSON", jsonObject.toString());
        newIntent.putExtras(extraBundle);
        startActivity(newIntent);
    }
}
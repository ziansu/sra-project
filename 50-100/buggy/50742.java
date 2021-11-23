@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case mil.nga.giat.mage.map.preference.TileOverlayPreferenceActivity.PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    mil.nga.giat.mage.map.cache.CacheProvider.getInstance(getActivity()).refreshTileOverlays();
                }
                break;
            }
    }
}
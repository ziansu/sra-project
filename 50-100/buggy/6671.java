@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case io.card.payment.CardIOActivity.PERMISSION_REQUEST_ID :
            {
                waitingForPermission = false;
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    showCameraScannerOverlay();
                }else {
                    manualEntryFallbackOrForced = true;
                }
                onResume();
            }
    }
}
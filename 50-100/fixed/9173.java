private void doNext(int requestCode, int[] grantResults) {
    int count = 0;
    if (requestCode == (ACCESS_PERMISSION)) {
        for (int i = 0; i < (grantResults.length); i++) {
            if ((grantResults[i]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))
                count++;
            
        }
        if (count == (grantResults.length))
            listener.onGranted();
        else
            listener.onDenied();
        
    }
}
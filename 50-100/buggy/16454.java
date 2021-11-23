public void enableFabs(boolean show) {
    if (!show) {
        trackingFab.hide();
        uploadFab.hide();
        uploadAvailable = (com.adsamcik.signalcollector.MainActivity.cloudStatus) != 0;
        uploadFabHidden = true;
    }else {
        trackingFab.show();
        if (uploadAvailable)
            uploadFab.show();
        
        uploadFabHidden = false;
    }
}
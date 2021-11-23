private void determineUploadTime(java.util.List<com.example.plpa.utils.ExpApplyJson.Policy> policies) {
    android.content.IntentFilter filter = new android.content.IntentFilter();
    for (com.example.plpa.utils.ExpApplyJson.Policy policy : policies) {
        if ((policy.Id) == (com.example.plpa.utils.UploadPolicy.CONNECTPOWER))
            filter.addAction(Intent.ACTION_POWER_CONNECTED);
        else
            if ((policy.Id) == (com.example.plpa.utils.UploadPolicy.CONNECTWIFI))
                filter.addAction(WifiManager.WIFI_STATE_CHANGED_ACTION);
            
        
    }
    registerBroadcastReciever(filter);
}
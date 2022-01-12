private void wifiStateChanged(int state) {
    switch (state) {
        case JxWifiManager.STATE_DISABLED :
            mContentView.setVisibility(View.INVISIBLE);
            break;
    }
}
private void setConnectionDate(java.lang.String beaconMac) {
    com.example.das.ufsc.beaconmonitor.ConnectionPerformanceInfo connPerformanceInfo = this.currentConnectedBeacons.get(beaconMac);
    if (connPerformanceInfo == null)
        return ;
    
    if (connPerformanceInfo.isFirstConnection()) {
        connPerformanceInfo.setFirstConnAcceptanceTS(new java.util.Date());
    }else {
        connPerformanceInfo.setLastConnAcceptanceTs(new java.util.Date());
    }
}
public void update(java.lang.Object data) {
    com.lth.thesis.blepublictransport.Beacons.BeaconPacket p = ((com.lth.thesis.blepublictransport.Beacons.BeaconPacket) (data));
    if ((p.type) == (com.lth.thesis.blepublictransport.Beacons.BeaconPacket.ENTERED_REGION)) {
    }else
        if ((p.type) == (com.lth.thesis.blepublictransport.Beacons.BeaconPacket.EXITED_REGION)) {
        }else
            if ((p.type) == (com.lth.thesis.blepublictransport.Beacons.BeaconPacket.RANGED_BEACONS)) {
                if ((p.beacons.size()) > 0) {
                    foundObjectsNear(p.beacons);
                }
            }
        
    
}
@java.lang.Override
public boolean isCarOccupiedInTime(java.lang.String carId, java.lang.String start, java.lang.String end) throws java.lang.Exception {
    java.util.Iterator<de.hm.edu.carads.models.Campaign> it = this.getAllCampaignsInTime(start, end).iterator();
    while (it.hasNext()) {
        de.hm.edu.carads.models.Campaign campaign = it.next();
        if (campaign.hasFellowAccepted(carId))
            return true;
        
    } 
    return false;
}
@java.lang.Override
public boolean isCarOccupiedInTime(java.lang.String carId, java.lang.String start, java.lang.String end) throws java.lang.Exception {
    java.util.Iterator<de.hm.edu.carads.models.Campaign> it = this.getAllCampaignsInTime(start, end).iterator();
    de.hm.edu.carads.controller.ApplicationControllerImpl.logger.info(((("is occupied between " + start) + " and ") + end));
    while (it.hasNext()) {
        de.hm.edu.carads.controller.ApplicationControllerImpl.logger.info("campaign");
        de.hm.edu.carads.models.Campaign campaign = it.next();
        if (campaign.hasFellowAccepted(carId))
            return true;
        
    } 
    return false;
}
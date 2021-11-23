public de.hm.edu.carads.models.Campaign getCampaign(java.lang.String id) {
    java.util.Iterator<de.hm.edu.carads.models.Campaign> it = campaigns.iterator();
    while (it.hasNext()) {
        de.hm.edu.carads.models.Campaign c = it.next();
        if (c.getId().equals(id))
            return c;
        
    } 
    return null;
}
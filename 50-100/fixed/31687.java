public de.hm.edu.carads.models.Campaign getCampaign(java.lang.String id) {
    if ((campaigns) == null)
        campaigns = new java.util.ArrayList<de.hm.edu.carads.models.Campaign>();
    
    java.util.Iterator<de.hm.edu.carads.models.Campaign> it = campaigns.iterator();
    while (it.hasNext()) {
        de.hm.edu.carads.models.Campaign c = it.next();
        if (c.getId().equals(id))
            return c;
        
    } 
    return null;
}
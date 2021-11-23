public com.xrtb.common.Campaign getCampaign(java.lang.String name, java.lang.String id) {
    com.xrtb.db.User u = map.get(name);
    if (u == null)
        return null;
    
    for (com.xrtb.common.Campaign c : u.campaigns) {
        if (c.adId.equals(id))
            return c;
        
    }
    return null;
}
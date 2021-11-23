public com.xrtb.common.Campaign getCampaign(java.lang.String id) {
    map = ((java.util.concurrent.ConcurrentMap) (com.xrtb.common.Configuration.getInstance().redisson.getMap("users-database")));
    java.util.Set set = map.keySet();
    java.util.Iterator<java.lang.String> it = set.iterator();
    while (it.hasNext()) {
        com.xrtb.db.User u = map.get(it.next());
        for (com.xrtb.common.Campaign c : u.campaigns) {
            if (c.adId.equals(id))
                return c;
            
        }
    } 
    return null;
}
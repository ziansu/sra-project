public java.util.List<fr.grk.ecp.models.User> getFollowings(java.lang.String handle) {
    fr.grk.ecp.beans.BasicDBObject query = new fr.grk.ecp.beans.BasicDBObject("follower", handle);
    fr.grk.ecp.beans.DBCursor cur = dbCollection.find(query);
    java.util.List<fr.grk.ecp.models.User> res = new java.util.ArrayList<fr.grk.ecp.models.User>();
    if ((null != cur) && (cur.hasNext())) {
        fr.grk.ecp.models.Following f = fr.grk.ecp.models.Following.fromDBObject(cur.next());
        res.add(userSessionBean.getUser(f.getFolloweeHandle()));
    }
    return res;
}
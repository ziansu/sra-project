@javax.ws.rs.GET
public java.util.Hashtable showBasicInfoPerson(@javax.ws.rs.PathParam(value = "id")
java.lang.Long id) {
    java.util.Hashtable infos = new java.util.Hashtable();
    infos.put("name", pm.getNameOfUser(id));
    infos.put("surname", pm.getSurnameOfUser(id));
    infos.put("login", pm.getLoginOfUser(id));
    infos.put("cancelledBids", pm.getCancelBidsOfUser(id));
    return infos;
}
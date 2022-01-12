public java.lang.String getCommunity(at.fhj.swd13.pse.db.entity.Message m) {
    community = "";
    for (at.fhj.swd13.pse.db.entity.Community c : m.getCommunities()) {
        if ((community) != "") {
            community += ", ";
        }
        community += c.getName();
    }
    return community;
}
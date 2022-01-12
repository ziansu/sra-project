public boolean hasChildren() {
    boolean hasKids = false;
    for (mekhq.campaign.personnel.Ancestors a : campaign.getAncestors()) {
        if ((getId().equals(a.getMotherID())) || (getId().equals(a.getFatherID()))) {
            hasKids = true;
            break;
        }
    }
    return hasKids;
}
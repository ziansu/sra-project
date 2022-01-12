private void addPortalAccepted(com.einzig.ipst2.portal.PortalAccepted portal) {
    com.einzig.ipst2.portal.PortalSubmission pending = db.getPendingPortal(portal.getPictureURL());
    if (pending != null) {
        portal.setDateSubmitted(pending.getDateSubmitted());
        db.deletePending(pending);
    }
    db.addPortalAccepted(portal);
}
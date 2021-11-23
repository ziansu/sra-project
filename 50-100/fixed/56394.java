private void addPortalAccepted(com.einzig.ipst2.portal.PortalAccepted portal) {
    com.einzig.ipst2.portal.PortalSubmission pending = db.getPendingPortal(portal.getPictureURL(), portal.getName());
    if (pending != null) {
        portal.setDateSubmitted(pending.getDateSubmitted());
        db.deletePending(pending);
    }
    db.addPortalAccepted(portal);
}
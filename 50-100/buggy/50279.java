public java.util.Collection<com.stratelia.webactiv.util.publication.model.PublicationDetail> getElements(com.stratelia.webactiv.kmelia.KmeliaTransversal kmeliaTransversal, com.stratelia.webactiv.beans.admin.UserFull user, java.lang.String spaceId) throws java.rmi.RemoteException {
    int maxAge = com.silverpeas.kmelia.RssLastPublicationsServlet.settings.getInteger("max.age.last.publication", 0);
    int nbReturned = com.silverpeas.kmelia.RssLastPublicationsServlet.settings.getInteger("max.nb.last.publication", 10);
    return kmeliaTransversal.getUpdatedPublications(spaceId, maxAge, nbReturned);
}
private java.util.List<com.stratelia.webactiv.kmelia.model.KmeliaPublication> pubDetails2userPubs(java.util.Collection<com.stratelia.webactiv.util.publication.model.PublicationDetail> pubDetails) {
    java.util.List<com.stratelia.webactiv.kmelia.model.KmeliaPublication> publications = new java.util.ArrayList<com.stratelia.webactiv.kmelia.model.KmeliaPublication>();
    for (com.stratelia.webactiv.util.publication.model.PublicationDetail publicationDetail : pubDetails) {
        publications.add(com.stratelia.webactiv.kmelia.model.KmeliaPublication.aKmeliaPublicationFromDetail(publicationDetail));
    }
    return publications;
}
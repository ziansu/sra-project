public static boolean needsFresh(java.util.Date dbDate, org.orcid.jaxb.model.message.OrcidProfile orcidProfile) {
    if (orcidProfile == null)
        return true;
    
    if (!(orcidProfile.extractLastModifiedDate().equals(dbDate)))
        return true;
    
    if (dbDate == null)
        return true;
    
    return false;
}
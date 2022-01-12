public static boolean needsFresh(java.util.Date dbDate, org.orcid.jaxb.model.message.OrcidProfile orcidProfile) {
    if (orcidProfile == null)
        return true;
    
    if (dbDate == null)
        return true;
    
    if ((orcidProfile.extractLastModifiedDate().getTime()) != (dbDate.getTime()))
        return true;
    
    return false;
}
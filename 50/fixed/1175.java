private boolean currentUserIsOwner(org.molgenis.data.Entity entity) {
    if (null == entity)
        return false;
    
    return org.molgenis.security.core.utils.SecurityUtils.getCurrentUsername().equals(getOwnerUserName(entity));
}
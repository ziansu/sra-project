public void setType(org.ndexbio.model.object.Permissions permission) throws org.ndexbio.model.exceptions.NdexException {
    if ((permission != (Permissions.GROUPADMIN)) && (permission != (Permissions.MEMBER)))
        throw new org.ndexbio.model.exceptions.NdexException("Permission type for request can only be GROUPADMIN or MEMBER.");
    
    this.type = permission;
}
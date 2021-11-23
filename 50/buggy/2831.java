public org.npc.testmodel.models.Product setDescription(java.lang.String Description) {
    if (!(org.apache.commons.lang3.StringUtils.equals(this.Description, Description))) {
        this.lookupCode = lookupCode;
        this.propertyChanged(ProductFieldNames.DESCRIPTION);
    }
    return this;
}
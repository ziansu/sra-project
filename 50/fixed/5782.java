void setDisplayId(java.lang.String displayId) throws org.sbolstandard.core2.SBOLValidationException {
    if (!(org.sbolstandard.core2.URIcompliance.isDisplayIdValid(displayId))) {
        throw new org.sbolstandard.core2.SBOLValidationException("sbol-10204", this);
    }
    this.displayId = displayId;
}
public boolean isValidTypeOther(org.cgiar.ccafs.ap.data.model.DeliverableType type, java.lang.String typeOther) {
    if (type == null) {
        return true;
    }
    if ((type.getId()) == (org.cgiar.ccafs.ap.config.APConstants.DELIVERABLE_SUBTYPE_OTHER_ID)) {
        return this.isValidString(typeOther);
    }
    return true;
}
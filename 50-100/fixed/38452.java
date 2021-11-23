public void setInfoFields(boolean useInfoField, java.util.Collection<java.lang.String> infoFields) {
    this.useInfoField = useInfoField;
    useInfoFieldAll = false;
    if (useInfoField) {
        if (infoFields == null) {
            this.infoFields = null;
            if (useInfoField)
                useInfoFieldAll = true;
            
        }else {
            this.infoFields = new java.util.HashSet<java.lang.String>();
            this.infoFields.addAll(infoFields);
        }
    }else {
        this.infoFields = null;
    }
}
@java.lang.Override
protected boolean isFormComplete() {
    for (java.lang.Object field : fields.values()) {
        if (field == null)
            return false;
        
    }
    return true;
}
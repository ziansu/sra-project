public void set(java.lang.String fieldName, java.lang.Object obj) throws java.lang.IllegalArgumentException {
    if (fieldName.equalsIgnoreCase("id")) {
        if (obj instanceof java.lang.Integer)
            id = ((java.lang.Integer) (obj));
        else
            throw new java.lang.IllegalArgumentException("id must be integer");
        
    }else {
        mField.put(fieldName, obj);
    }
}
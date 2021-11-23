public java.lang.Double getLongitude(java.lang.String fieldname) {
    java.lang.String[] parts = getSpaceDelimitedFieldParts(fieldname);
    if (parts == null)
        return null;
    
    if ((parts.length) > 1) {
        try {
            return java.lang.Double.parseDouble(parts[1]);
        } catch (java.lang.NumberFormatException e) {
        }
    }
    return null;
}
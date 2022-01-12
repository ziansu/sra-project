public void setLocation(java.lang.String l) {
    try {
        if (l == null) {
            throw new java.lang.IllegalArgumentException((("'" + l) + "' cannot be null"));
        }else
            if (("Unknown".equals(l)) || ("".equals(l))) {
                throw new java.lang.IllegalArgumentException("Cannot be 'Unknown'");
            }else {
                this.location = l;
            }
        
    } catch (java.lang.Exception e) {
    }
}
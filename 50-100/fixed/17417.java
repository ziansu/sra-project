public void setLocation(java.lang.String location) {
    try {
        if (location == null) {
            throw new java.lang.IllegalArgumentException((("'" + location) + "' cannot be null"));
        }else
            if (("Unknown".equals(location)) || ("".equals(location))) {
                throw new java.lang.IllegalArgumentException("Cannot be 'Unknown'");
            }else {
                this.location = location;
            }
        
    } catch (java.lang.Exception e) {
    }
}
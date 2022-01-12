private java.lang.String valueOf(java.lang.Object object) {
    if (object == null) {
        throw new java.lang.RuntimeException("Can't save null");
    }else
        if (object instanceof java.util.Date) {
            java.util.Date date = ((java.util.Date) (object));
            return java.lang.String.valueOf(date.getTime());
        }else
            if (object instanceof java.lang.Enum) {
                return ((java.lang.Enum) (object)).name();
            }else {
                return java.lang.String.valueOf(object);
            }
        
    
}
private java.lang.String concating(java.lang.String... vals) {
    java.lang.String concat = "";
    if (vals != null) {
        for (java.lang.String val : vals) {
            if (org.apache.commons.lang3.StringUtils.isNotBlank(val)) {
                concat += val + ", ";
            }
        }
        if (org.apache.commons.lang3.StringUtils.isNotBlank(concat))
            concat = concat.substring(0, concat.lastIndexOf(","));
        
    }
    return concat;
}
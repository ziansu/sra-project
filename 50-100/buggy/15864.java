public int compareTo(java.lang.Object o) {
    if (o instanceof com.cedarsoftware.util.CaseInsensitiveMap.CaseInsensitiveString) {
        com.cedarsoftware.util.CaseInsensitiveMap.CaseInsensitiveString other = ((com.cedarsoftware.util.CaseInsensitiveMap.CaseInsensitiveString) (o));
        if ((hash) == (other.hash)) {
            return 0;
        }
        return caseInsensitiveString.compareToIgnoreCase(other.caseInsensitiveString);
    }else
        if (o instanceof java.lang.String) {
            java.lang.String other = ((java.lang.String) (o));
            return caseInsensitiveString.compareToIgnoreCase(other);
        }else {
            return -1;
        }
    
}
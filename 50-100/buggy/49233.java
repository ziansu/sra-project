public static java.lang.String toBase62(long i) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("");
    if (i == 0) {
        return "a";
    }
    while (i > 0) {
        i = gov.ca.cwds.data.persistence.cms.Base62.fromBase10(i, sb);
    } 
    return sb.reverse().toString();
}
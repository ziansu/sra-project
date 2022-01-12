public static java.lang.String toBase62(long i) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("");
    if (i == 0) {
        return "a";
    }
    long j = i;
    while (j > 0) {
        j = gov.ca.cwds.data.persistence.cms.Base62.fromBase10(j, sb);
    } 
    return sb.reverse().toString();
}
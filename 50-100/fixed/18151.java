private boolean jj_3R_63() {
    if (jj_3R_56())
        return true;
    
    if (jj_scan_token(com.orientechnologies.orient.core.sql.parser.LPAREN))
        return true;
    
    com.orientechnologies.orient.core.sql.parser.Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_174())
        jj_scanpos = xsp;
    
    if (jj_scan_token(com.orientechnologies.orient.core.sql.parser.RPAREN))
        return true;
    
    return false;
}
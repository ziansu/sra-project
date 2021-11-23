private boolean jj_3R_382() {
    if (jj_scan_token(com.orientechnologies.orient.core.sql.parser.STRATEGY))
        return true;
    
    com.orientechnologies.orient.core.sql.parser.Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_386()) {
        jj_scanpos = xsp;
        if (jj_3R_387())
            return true;
        
    }
    return false;
}
private boolean jj_3R_38() {
    if (jj_scan_token(jeng.compiler.syntax.IMPORT))
        return true;
    
    if (jj_3R_40())
        return true;
    
    jeng.compiler.syntax.Token xsp;
    while (true) {
        xsp = jj_scanpos;
        if (jj_3R_65()) {
            jj_scanpos = xsp;
            break;
        }
    } 
    if (jj_scan_token(jeng.compiler.syntax.P_FROM))
        return true;
    
    if (jj_3R_66())
        return true;
    
    xsp = jj_scanpos;
    if (jj_3R_67())
        jj_scanpos = xsp;
    
    if (jj_scan_token(jeng.compiler.syntax.DOT))
        return true;
    
    return false;
}
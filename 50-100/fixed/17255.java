private boolean jj_3R_38() {
    if (jj_scan_token(jeng.compiler.syntax.IMPORT))
        return true;
    
    if (jj_3R_65())
        return true;
    
    jeng.compiler.syntax.Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_67())
        jj_scanpos = xsp;
    
    if (jj_scan_token(jeng.compiler.syntax.DOT))
        return true;
    
    return false;
}
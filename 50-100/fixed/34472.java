private boolean jj_3_2() {
    if (jj_scan_token(org.sbml.jsbml.text.parser.STRING))
        return true;
    
    org.sbml.jsbml.text.parser.Token xsp;
    if (jj_3R_9())
        return true;
    
    while (true) {
        xsp = jj_scanpos;
        if (jj_3R_9()) {
            jj_scanpos = xsp;
            break;
        }
    } 
    return false;
}
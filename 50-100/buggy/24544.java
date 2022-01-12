private boolean jj_3R_37() {
    if (jj_3R_84())
        return true;
    
    parse.Token xsp;
    while (true) {
        xsp = jj_scanpos;
        if (jj_3R_85()) {
            jj_scanpos = xsp;
            break;
        }
    } 
    xsp = jj_scanpos;
    if (jj_3R_86()) {
        jj_scanpos = xsp;
        if (jj_3R_87()) {
            jj_scanpos = xsp;
            if (jj_3R_88())
                return true;
            
        }
    }
    return false;
}
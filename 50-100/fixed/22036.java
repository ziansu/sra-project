public static java.lang.String getAcrobatPath() {
    java.lang.String sRet = edu.clemson.lph.civet.prefs.CivetConfig.props.getProperty("acrobatPath");
    if (sRet != null) {
        java.io.File f = new java.io.File(sRet);
        if ((!(f.exists())) || (!(f.isFile()))) {
            sRet = null;
        }
    }
    if ((sRet != null) && ((sRet.trim().length()) == 0))
        sRet = null;
    
    return sRet;
}
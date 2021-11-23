public static java.lang.String getRobotOutputFormat() {
    java.lang.String sRet = edu.clemson.lph.civet.prefs.CivetConfig.props.getProperty("robotOutputFormat");
    if (sRet != null) {
        if ((!(sRet.equals("STD"))) && (!(sRet.equals("ADOBE"))))
            edu.clemson.lph.civet.prefs.CivetConfig.exitError(("Unknown robot output format: " + sRet));
        
    }
    if ((sRet != null) && ((sRet.trim().length()) == 0))
        sRet = null;
    
    return sRet;
}
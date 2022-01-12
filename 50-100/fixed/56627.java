public static boolean hasBrokenLIDs() {
    if ((edu.clemson.lph.civet.prefs.CivetConfig.bBrokenLIDs) == null) {
        java.lang.String sVal = edu.clemson.lph.civet.prefs.CivetConfig.props.getProperty("brokenLIDs");
        if ((((sVal == null) || ((sVal.trim().length()) == 0)) || (sVal.equalsIgnoreCase("true"))) || (sVal.equalsIgnoreCase("yes"))) {
            edu.clemson.lph.civet.prefs.CivetConfig.bBrokenLIDs = true;
        }else {
            edu.clemson.lph.civet.prefs.CivetConfig.bBrokenLIDs = false;
        }
    }
    return edu.clemson.lph.civet.prefs.CivetConfig.bBrokenLIDs;
}
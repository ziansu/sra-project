public static boolean hasStateIDChecksum() {
    if ((edu.clemson.lph.civet.prefs.CivetConfig.bBrokenLIDs) == null) {
        java.lang.String sVal = edu.clemson.lph.civet.prefs.CivetConfig.props.getProperty("stateIDChecksum");
        if (((sVal == null) || (sVal.equalsIgnoreCase("true"))) || (sVal.equalsIgnoreCase("yes"))) {
            edu.clemson.lph.civet.prefs.CivetConfig.bStateIDChecksum = true;
        }else {
            edu.clemson.lph.civet.prefs.CivetConfig.bStateIDChecksum = false;
        }
    }
    return edu.clemson.lph.civet.prefs.CivetConfig.bStateIDChecksum;
}
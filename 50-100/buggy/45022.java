public static boolean isDefaultReceivedDate() {
    if ((edu.clemson.lph.civet.prefs.CivetConfig.bDefaultReceivedDate) == null) {
        java.lang.String sVal = edu.clemson.lph.civet.prefs.CivetConfig.props.getProperty("defaultReceivedDate");
        if (sVal == null)
            edu.clemson.lph.civet.prefs.CivetConfig.bDefaultReceivedDate = false;
        else
            if ((sVal.equalsIgnoreCase("true")) || (sVal.equalsIgnoreCase("yes"))) {
                edu.clemson.lph.civet.prefs.CivetConfig.bDefaultReceivedDate = true;
            }else {
                edu.clemson.lph.civet.prefs.CivetConfig.bDefaultReceivedDate = false;
            }
        
    }
    return edu.clemson.lph.civet.prefs.CivetConfig.bDefaultReceivedDate;
}
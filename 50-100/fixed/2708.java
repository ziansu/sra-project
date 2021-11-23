public static boolean isAutoOpenPdf() {
    if ((edu.clemson.lph.civet.prefs.CivetConfig.bAutoOpenPDF) == null) {
        java.lang.String sVal = edu.clemson.lph.civet.prefs.CivetConfig.props.getProperty("autoOpenPdf");
        if ((sVal == null) || ((sVal.trim().length()) == 0))
            edu.clemson.lph.civet.prefs.CivetConfig.bAutoOpenPDF = true;
        else
            if ((sVal.equalsIgnoreCase("true")) || (sVal.equalsIgnoreCase("yes"))) {
                edu.clemson.lph.civet.prefs.CivetConfig.bAutoOpenPDF = true;
            }else {
                edu.clemson.lph.civet.prefs.CivetConfig.bAutoOpenPDF = false;
            }
        
    }
    return edu.clemson.lph.civet.prefs.CivetConfig.bAutoOpenPDF;
}
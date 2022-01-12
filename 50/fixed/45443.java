public static java.lang.String getEmailCopyTo() {
    java.lang.String sRet = edu.clemson.lph.civet.prefs.CivetConfig.props.getProperty("emailCopyTo");
    if ((sRet != null) && ((sRet.trim().length()) == 0))
        sRet = null;
    
    return sRet;
}
public static long getMaxAnimals() {
    long iRet = -1;
    java.lang.String sRet = edu.clemson.lph.civet.prefs.CivetConfig.props.getProperty("maxAnimals");
    if (sRet == null) {
        return edu.clemson.lph.civet.prefs.CivetConfig.DEFAULT_MAX_ANIMALS;
    }
    try {
        iRet = java.lang.Integer.parseInt(sRet);
    } catch (java.lang.NumberFormatException nfe) {
        edu.clemson.lph.civet.prefs.CivetConfig.logger.error((("Cannot read maxAnimals " + sRet) + " as an integer number"));
        edu.clemson.lph.civet.prefs.CivetConfig.logger.error(nfe);
        return edu.clemson.lph.civet.prefs.CivetConfig.DEFAULT_MAX_ANIMALS;
    }
    return iRet;
}
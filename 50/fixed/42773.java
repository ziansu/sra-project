private static boolean checkResponseCode(int code, boolean raise) throws edu.rit.gis.doctoreducator.exception.HttpResponseException {
    boolean result = (code / 100) == 2;
    if ((!result) && raise) {
        throw new edu.rit.gis.doctoreducator.exception.HttpResponseException(code);
    }else {
        return result;
    }
}
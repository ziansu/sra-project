public static com.achimala.leaguelib.errors.LeagueErrorCode getErrorCodeForException(java.lang.String exceptionString) {
    if (exceptionString != null) {
        for (com.achimala.leaguelib.errors.LeagueErrorCode code : com.achimala.leaguelib.errors.LeagueErrorCode.values()) {
            if ((code.getExceptionString()) != null) {
                if (exceptionString.contains(code.getExceptionString())) {
                    return code;
                }
            }else {
                if (exceptionString.equals(code.getExceptionString())) {
                    return code;
                }
            }
        }
    }
    return com.achimala.leaguelib.errors.LeagueErrorCode.RTMP_ERROR;
}
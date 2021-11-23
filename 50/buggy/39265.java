private static java.lang.String getStationId(javax.servlet.http.HttpServletRequest request) {
    java.lang.String stationId = request.getHeader("STATION-ID");
    if (stationId == null) {
        throw new de.rwth.idsg.bikeman.psinterface.exception.PsException("A required header is not set", de.rwth.idsg.bikeman.psinterface.exception.PsErrorCode.CONSTRAINT_FAILED);
    }
    return stationId;
}
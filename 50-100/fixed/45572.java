@java.lang.Override
public java.util.List<io.github.jass2125.igeo.core.entity.Ride> getRides(java.lang.String origin, java.lang.String date) throws io.github.jass2125.igeo.core.exceptions.ApplicationException {
    try {
        return rideDao.searchByParameters(origin, date);
    } catch (java.lang.Exception e) {
        throw new io.github.jass2125.igeo.core.exceptions.ApplicationException(e, e.getMessage());
    }
}
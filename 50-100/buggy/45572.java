@java.lang.Override
public java.util.Set<io.github.jass2125.igeo.core.entity.Ride> getRides(java.lang.String origin, java.lang.String destination, java.lang.String date) throws io.github.jass2125.igeo.core.exceptions.ApplicationException {
    try {
        return rideDao.searchByParameters(origin, destination, date);
    } catch (java.lang.Exception e) {
        throw new io.github.jass2125.igeo.core.exceptions.ApplicationException(e, e.getMessage());
    }
}
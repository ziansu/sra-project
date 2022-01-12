@java.lang.Override
public boolean isValidFlightNumber(java.lang.String flightNumber) {
    if ((!(planes.isEmpty())) && ((planes.get(planes.search(flightNumber)).getKey().compareTo(flightNumber)) == 0))
        return true;
    else
        return false;
    
}
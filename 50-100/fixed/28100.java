@java.lang.Override
public boolean isValidFlightNumber(java.lang.String flightNumber) {
    int index = planes.search(flightNumber);
    if (((!(planes.isEmpty())) && (index != (planes.size()))) && ((planes.get(index).getKey().compareTo(flightNumber)) == 0))
        return true;
    else
        return false;
    
}
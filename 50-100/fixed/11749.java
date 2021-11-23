@java.lang.Override
public boolean availableForBooking(java.util.Set<com.real.apps.shuttle.domain.model.BookedRange> potentialBookedRanges, com.real.apps.shuttle.domain.model.BookedRange bookedRange) {
    if ((potentialBookedRanges == null) || (potentialBookedRanges.isEmpty())) {
        return true;
    }
    java.util.Iterator<com.real.apps.shuttle.domain.model.BookedRange> iterator = potentialBookedRanges.iterator();
    while (iterator.hasNext()) {
        com.real.apps.shuttle.domain.model.BookedRange subject = iterator.next();
        if ((subject != null) && (subject.coincide(bookedRange))) {
            return false;
        }
    } 
    return true;
}
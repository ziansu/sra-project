@java.lang.Override
public java.lang.Object clone() {
    com.jonfreer.wedding.domain.Reservation reservationObj = null;
    try {
        reservationObj = ((com.jonfreer.wedding.domain.Reservation) (super.clone()));
        if ((reservationObj.submittedDateTime) != null) {
            reservationObj.submittedDateTime = ((java.util.Date) (reservationObj.submittedDateTime.clone()));
        }
    } catch (java.lang.CloneNotSupportedException e) {
    }
    return reservationObj;
}
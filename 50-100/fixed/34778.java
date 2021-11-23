private net.estebanrodriguez.apps.classtrip.model.trip.Trip buildTrip() {
    java.lang.String userId = ((net.estebanrodriguez.apps.classtrip.ui.activities.MainActivity) (getActivity())).getUserId();
    net.estebanrodriguez.apps.classtrip.model.trip.Trip trip = new net.estebanrodriguez.apps.classtrip.model.trip.Trip.Builder(userId).withStartDate(mDateStart).withEndDate(mDateEnd).withStartTime(mTimeStart).withEndTime(mTimeEnd).withPlace(mPlaceId).build();
    return trip;
}
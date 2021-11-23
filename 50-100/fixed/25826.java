@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((userBookingRecord.size()) != 0) {
        java.lang.String deletObjectId = userBookingRecord.get(position).getObjectId();
        userBookingRecord.remove(position);
        recordAdapter.updateTheDate(userBookingRecord);
        new com.thoughtworks.android.booking.biz.DatabaseOperation().deleteBookingInformationAccordingToTheTime(deletObjectId);
    }
}
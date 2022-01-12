@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String deletObjectId = userBookingRecord.get(position).getObjectId();
    userBookingRecord.remove(position);
    recordAdapter.updateTheDate(userBookingRecord);
    new com.thoughtworks.android.booking.biz.DatabaseOperation().deleteBookingInformationAccordingToTheTime(deletObjectId);
}
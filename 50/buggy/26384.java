private void setDateOfLastDailyTip(long date) {
    java.lang.String userId = getUserId();
    if (userId != null) {
        mDatabase.child("users").child(userId).child("dateOfLastDailyTip").setValue(date);
    }
}
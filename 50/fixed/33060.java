public void setIndexOfLastDailyTip(int index) {
    java.lang.String userId = getUserId();
    if (userId != null) {
        mDatabase.child("users").child(userId).child("indexOfLastDailyTip").setValue(index);
    }
}
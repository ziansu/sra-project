public java.util.Date getNextBirthday() {
    java.util.Date date = birthday.getNextAnniversary();
    android.util.Log.e("OK", date.toString());
    return date;
}
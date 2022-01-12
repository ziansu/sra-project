public boolean equals(com.gpteam.shopmanager.Time.Date otherDate) {
    return (((getYear()) == (otherDate.getYear())) && ((getMonth()) == ((otherDate.getMonth()) + 1))) && ((getDay()) == (otherDate.getDay()));
}
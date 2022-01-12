public boolean isBooked(java.sql.Timestamp timestamp) {
    return ((timestamp.equals(tStart)) || (timestamp.equals(tEnd))) || ((timestamp.after(tStart)) && (timestamp.before(tEnd)));
}
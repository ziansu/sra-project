public void addNewMessage(final Message msg) {
    Message copy = new Message(msg);
    java.sql.Timestamp curTime = new java.sql.Timestamp(java.util.Calendar.getInstance().getTime().getTime());
    copy.setTimestamp(curTime);
    copy.setId(nextID);
    nextID = nextID.add(java.math.BigInteger.ONE);
    messages.add(copy);
}
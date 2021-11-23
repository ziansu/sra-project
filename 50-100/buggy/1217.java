private void setLecture() {
    java.lang.String PID = in.next();
    java.lang.String CID = in.next();
    java.lang.String date = in.next();
    java.lang.String start = in.next();
    java.lang.String end = in.next();
    java.lang.String room = in.next();
    sdc.insert(ServerDatabaseConnection.LECTURES, new java.lang.String[]{ PID , CID , date , start , end , room });
}
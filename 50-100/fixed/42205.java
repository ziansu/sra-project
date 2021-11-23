public void updateDJActivity(java.lang.String curDJ, java.lang.String streamName) {
    sqlConn.update(RadioDj.RADIO_DJ).set(RadioDj.RADIO_DJ.ACTIVE, 0).execute();
    if ((curDJ != null) && ((curDJ.length()) > 0)) {
        sqlConn.insertInto(RadioDj.RADIO_DJ).values(null, curDJ, curDJ, streamName, "default", 1).onDuplicateKeyUpdate().set(RadioDj.RADIO_DJ.ACTIVE, 1).set(RadioDj.RADIO_DJ.STREAMNAME, streamName).execute();
    }
}
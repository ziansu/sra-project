public void serialPortLog(int direction, java.lang.String msg) {
    if ((writer) != null) {
        writer.println((((("+" + (org.jeffpiazza.derby.Timestamp.brief())) + "\t\t") + (direction == (org.jeffpiazza.derby.LogWriter.INCOMING) ? "<-- " : direction == (org.jeffpiazza.derby.LogWriter.OUTGOING) ? "--> " : "INT ")) + (msg.replace("\r", "\\r"))));
    }
}
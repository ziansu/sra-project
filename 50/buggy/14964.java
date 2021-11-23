@java.lang.Override
public void onReceived(final org.md2k.datakitapi.datatype.DataType dataType) {
    java.lang.Thread t = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            lastAckTimeStamp = org.md2k.datakitapi.time.DateTime.getDateTime();
        }
    });
    t.start();
}
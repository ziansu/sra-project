void subscribeNotificationAck() throws org.md2k.datakitapi.exception.DataKitException {
    for (int i = 0; i < (dataSourceClientAcks.size()); i++) {
        org.md2k.datakitapi.DataKitAPI.getInstance(context).subscribe(dataSourceClientAcks.get(i), new org.md2k.datakitapi.messagehandler.OnReceiveListener() {
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
        });
    }
}
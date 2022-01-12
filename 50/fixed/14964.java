@java.lang.Override
public void onReceived(final org.md2k.datakitapi.datatype.DataType dataType) {
    lastAckTimeStamp = org.md2k.datakitapi.time.DateTime.getDateTime();
}
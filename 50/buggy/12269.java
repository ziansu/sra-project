@java.lang.Override
public void addIfRequired(org.opencloudb.net.mysql.RowDataPacket row) {
    org.opencloudb.net.mysql.RowDataPacket root = getRoot();
    if ((cmp.compare(row, root)) > 0) {
        setRoot(row);
    }
}
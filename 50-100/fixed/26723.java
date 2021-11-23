@java.lang.Override
public java.lang.String toString() {
    java.lang.String tempData = " ";
    if (!(data.equals(""))) {
        tempData = data;
    }
    return ((((((((lsn) + ",") + (logType)) + ",") + (taid)) + ",") + (pageid)) + ",") + tempData;
}
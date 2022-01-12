@java.lang.Override
public java.lang.String toString() {
    java.lang.String tempData = " ";
    if (!(tempData.equals(""))) {
        tempData = data;
    }
    return ((((((((lsn) + ",") + (logType)) + ",") + (taid)) + ",") + (pageid)) + ",") + tempData;
}
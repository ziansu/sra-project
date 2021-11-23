@org.junit.Before
public void setUp() {
    accesser = org.apache.spark.smstorage.sharedmemory.ShmgetAccesser.getInstance("worker");
    shmId = java.lang.Integer.parseInt(accesser.applySpace(applySize));
    printByteArr(null, 0);
}
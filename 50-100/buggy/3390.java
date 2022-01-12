@java.lang.Override
public void readData(com.hazelcast.nio.ObjectDataInput in) throws java.io.IOException {
    this.source = in.readLong();
    this.destination = in.readLong();
    this.sagaID = in.readInt();
    this.txID = in.readInt();
}
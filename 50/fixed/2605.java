@java.lang.Override
public void readData(com.hazelcast.nio.ObjectDataInput in) throws java.io.IOException {
    mesh = in.readObject();
    mRHS = in.readObject();
}
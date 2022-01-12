@java.lang.Override
public void writeData(com.hazelcast.nio.ObjectDataOutput out) throws java.io.IOException {
    out.writeObject(mesh);
    out.writeObject(mRHS);
}
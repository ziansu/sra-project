@java.lang.Override
public void readFields(java.io.DataInput in) throws java.io.IOException {
    int size = in.readInt();
    shortestpath = new int[size];
    for (int i = 0; i < size; i++) {
        shortestpath[i] = in.readInt();
    }
}
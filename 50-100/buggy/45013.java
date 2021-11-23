@java.lang.Override
public void write(java.io.DataOutput out) throws java.io.IOException {
    out.writeInt(shortestpath.length);
    for (int i = 0; i < (shortestpath.length); i++) {
        out.writeInt(shortestpath[i]);
    }
}
@java.lang.Override
public void write(java.io.DataOutput out) throws java.io.IOException {
    if ((shortestpath) == null) {
        out.writeInt(0);
        return ;
    }
    out.writeInt(shortestpath.length);
    for (int i = 0; i < (shortestpath.length); i++) {
        out.writeInt(shortestpath[i]);
    }
}
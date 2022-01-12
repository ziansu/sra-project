@java.lang.Override
public void unpackFromFrontOfList(java.util.List<org.msgpack.type.Value> l) {
    int check_ntype = l.remove(0).asIntegerValue().getInt();
    if (check_ntype != (ntype)) {
        android.util.Log.e(com.mooshim.mooshimeter.common.ConfigTree.TAG, "WRONG NODE TYPE");
    }
    java.util.List<org.msgpack.type.Value> new_path = l.remove(0).asArrayValue();
    path = new java.util.ArrayList<java.lang.Integer>();
    for (org.msgpack.type.Value v : new_path) {
        path.add(v.asIntegerValue().getInt());
    }
}
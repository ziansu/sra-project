@java.lang.Override
public java.lang.Iterable<java.lang.String> get() {
    java.util.List<java.lang.String> ret = new java.util.ArrayList<java.lang.String>();
    for (int i = 0; i < count; i++) {
        for (int j = 0; j < 5; j++) {
            ret.add(java.lang.Integer.toString(i));
        }
    }
    return ret;
}
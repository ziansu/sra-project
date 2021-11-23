@java.lang.Override
public void set(java.lang.Boolean value) {
    java.util.Collection<java.lang.Object> coll = container.get();
    if (value) {
        if (coll != null) {
            if (!(coll.contains(item))) {
                coll.add(item);
            }
        }else {
            coll = org.rapidoid.util.U.list(item);
        }
    }else {
        if (coll != null) {
            coll.remove(item);
        }
    }
    container.set(coll);
}
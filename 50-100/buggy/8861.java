@java.lang.Override
public void set(java.lang.Boolean value) {
    java.util.Collection<java.lang.Object> coll = container.get();
    if (value) {
        if (coll != null) {
            if (!(coll.contains(item))) {
                coll.add(item);
            }
        }else {
            container.set(org.rapidoid.util.U.list(item));
        }
    }else {
        if (coll != null) {
            coll.remove(item);
        }
    }
}
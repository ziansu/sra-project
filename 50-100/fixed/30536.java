@java.lang.Override
public void pop(int index, java.lang.Object v) {
    if (!(java.lang.Boolean.TRUE.equals(v))) {
        java.lang.Object del = model.remove(((model.size()) - 1));
        org.rapidoid.u.U.must((del == v));
    }
}
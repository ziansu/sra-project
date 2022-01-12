private <T> java.lang.String joinString(java.util.Vector<T> vec) {
    java.lang.String ret = "";
    if ((vec.size()) > 0);
    ret = vec.get(0).toString();
    for (int i = 1; i < (vec.size()); i++) {
        ret = (ret + ", ") + (vec.get(i).toString());
    }
    return ret;
}
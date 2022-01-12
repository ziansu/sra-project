@java.lang.Override
public int getChildrenCount(int i) {
    int size = 0;
    if ((parent.size()) > 0) {
        java.lang.String key = parent.get(i);
        size = datas.get(key).size();
    }
    return size;
}
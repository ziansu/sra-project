@java.lang.Override
public java.lang.Object[] toArray() {
    final java.lang.Object[] result = new java.lang.Object[size];
    int i = 0;
    for (T key : map.keySet()) {
        java.lang.Integer count = map.get(i);
        assert count != null;
        if (count == null)
            continue;
        
        assert 0 < count;
        while (0 < count) {
            result[(i++)] = key;
            count--;
        } 
    }
    return result;
}
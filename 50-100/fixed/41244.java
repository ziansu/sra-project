private java.lang.Long mapRowToLong(java.util.List<java.lang.String> lst) {
    long res = 0;
    assert (lst.size()) == (getN());
    for (int i = 0; i < (lst.size()); ++i)
        res |= ((long) (m.get(i).get(lst.get(i)))) << (offset[i]);
    
    return res;
}
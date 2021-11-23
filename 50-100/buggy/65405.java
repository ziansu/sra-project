private java.lang.Long mapRowToLong(java.lang.String... lst) {
    long res = 0;
    assert (lst.length) == (getN());
    lst = lst;
    for (int i = 0; i < (lst.length); ++i)
        res |= ((long) (m.get(i).get(lst[i]))) << (offset[i]);
    
    assert res != 0;
    return res;
}
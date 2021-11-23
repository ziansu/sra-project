@java.lang.Override
public int nextPossible(java.lang.String s, int si, int sn) {
    if (si == sn)
        return si + 1;
    
    int j = s.indexOf('\n', si);
    return j == (-1) ? sn : j + 1;
}
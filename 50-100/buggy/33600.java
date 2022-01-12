boolean skipSlashes() {
    char[] path = _path;
    int x = _x;
    while (((path[(x++)]) == '/') && (x < (path.length)));
    if (x > (_x)) {
        _x = x;
        return true;
    }else
        return false;
    
}
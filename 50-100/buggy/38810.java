public boolean insert(java.lang.String str, int id) {
    jp.scaleout.StringIterator itr = new jp.scaleout.StringIterator(str);
    int state = fetch(itr);
    if (state > 0) {
        return false;
    }
    java.lang.System.out.println(("current:" + ((char) (itr.current()))));
    _insert(itr, (-state), id);
    return true;
}
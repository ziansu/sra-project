public void next() {
    if ((s) < 2) {
        (s)++;
        again();
    }else {
        ss.remove(ss.top());
        ss.remove(ss.top());
    }
}
public void next() {
    if ((s) < 2) {
        (s)++;
        again();
    }else {
        s = 0;
        ss.remove(ss.top());
        ss.remove(ss.top());
    }
}
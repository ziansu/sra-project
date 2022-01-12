private int getActionSize(java.util.List<java.lang.String> actions) {
    int s = actions.size();
    if (s == 0) {
        return s;
    }
    s -= (page) * 8;
    return java.lang.Math.min(8, s);
}
@java.lang.Override
public int compareTo(cc2.g3.Player.ComparableMove o) {
    int c = java.lang.Long.compare(this.key2, o.key2);
    if (c != 0) {
        return c;
    }
    c = java.lang.Long.compare(this.key1, o.key1);
    if (c != 0) {
        return c;
    }
    return java.lang.Integer.compare(this.randomized, o.randomized);
}
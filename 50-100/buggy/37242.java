public static boolean checkAttr(java.lang.Object a, java.lang.Object b, java.lang.Object c) {
    return ((a.equals(b)) && (b.equals(a))) || (((!(a.equals(b))) && (!(b.equals(c)))) && (!(c.equals(a))));
}
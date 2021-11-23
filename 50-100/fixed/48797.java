public static java.lang.String join(java.lang.CharSequence separator, java.lang.Iterable<java.lang.String> array) {
    java.lang.String ret = "";
    java.util.Iterator<java.lang.String> iterator = array.iterator();
    if (iterator.hasNext()) {
        ret = iterator.next();
        while (iterator.hasNext()) {
            ret += separator + (iterator.next());
        } 
    }
    return ret;
}
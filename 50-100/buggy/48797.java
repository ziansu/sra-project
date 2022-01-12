public static java.lang.String join(java.lang.CharSequence separator, java.lang.Iterable<java.lang.String> array) {
    java.lang.String ret = "";
    if (array.iterator().hasNext()) {
        ret = array.iterator().next();
        while (array.iterator().hasNext()) {
            ret += separator + (array.iterator().next());
        } 
    }
    return ret;
}
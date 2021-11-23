private void addFromResource(scala.collection.Iterator<java.lang.String> sr) {
    synchronized(this) {
        java.lang.String inp = sr.next();
        java.lang.String uri = inp.substring(0, inp.indexOf(" - "));
        java.lang.String id = inp.substring(((inp.indexOf(" - ")) + 3));
        map.put(uri, id);
    }
}
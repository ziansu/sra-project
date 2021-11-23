public heap.Tuple get_next() {
    heap.Tuple temp = new heap.Tuple();
    temp = null;
    try {
        temp = s.get_next();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e);
        e.printStackTrace();
    }
    return temp;
}
@java.lang.Override
public java.lang.Object[] toArray(java.lang.Object[] a) {
    if ((a.length) < (size)) {
        return this.toArray();
    }else {
        int i = 0;
        java.lang.Object[] array = new java.lang.Object[size];
        for (com.slon.MyList.Node node = head; node != null; node = node.next) {
            array[(i++)] = node.data;
        }
        return array;
    }
}
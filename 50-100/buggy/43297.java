@java.lang.Override
public byte[] array() {
    java.util.ListIterator<java.lang.Byte> it = this.container.listIterator();
    byte[] arr = new byte[this.container.size()];
    int i = 0;
    while ((it.hasNext()) && (i < (arr.length)))
        arr[(i++)] = it.next();
    
    return arr;
}
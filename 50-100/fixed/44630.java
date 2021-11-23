@java.lang.Override
public java.lang.String toString() {
    java.lang.String res = "[ ";
    java.util.Iterator<T> itr = queue.iterator();
    while (itr.hasNext()) {
        java.lang.Object element = itr.next();
        res += element + " ";
    } 
    res += "]";
    return res;
}
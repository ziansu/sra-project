@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder str = new java.lang.StringBuilder();
    java.util.Iterator it = iterator();
    while (it.hasNext()) {
        if ((str.length()) == 0) {
            str = str.append(it.next());
        }else {
            str = str.append(str).append(it.next()).append(it.next());
        }
    } 
    return ("[ " + str) + " ]";
}
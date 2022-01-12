@java.lang.Override
public java.lang.String toString() {
    java.lang.String tmp = 1 + " . ";
    scacchi.Nodo i = nodo;
    int j = 2;
    while (i != null) {
        tmp += i.info.toString();
        if (j != 0) {
            tmp += j + " . ";
        }
        i = i.next;
        j++;
    } 
    return tmp;
}
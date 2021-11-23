@java.lang.Override
public java.lang.String toString() {
    java.lang.String tmp = (" " + 1) + " . ";
    scacchi.Nodo i = nodo;
    int j = 2;
    while (i != null) {
        tmp = tmp + (i.info.toString());
        if ((j % 2) != 0) {
            tmp = ((tmp + " ") + ((j / 2) + 1)) + " . ";
        }
        i = i.next;
        j++;
    } 
    return tmp;
}
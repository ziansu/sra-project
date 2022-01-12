@java.lang.Override
public int indexOf(java.lang.Object o) {
    for (int i = 0; i <= (size); i++) {
        if (elements[i].equals(o))
            return i;
        
    }
    return -1;
}
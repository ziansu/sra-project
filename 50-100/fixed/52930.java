public boolean remove(java.lang.Object o) {
    for (int i = 0; i < (mySize); i++) {
        if (array[i].equals(o)) {
            (mySize)--;
            for (int j = i; j < (mySize); j++)
                array[j] = array[(j + 1)];
            
            return true;
        }
    }
    return false;
}
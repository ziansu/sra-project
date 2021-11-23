@java.lang.Override
public int size() {
    int arraysize = 0;
    for (int i = 0; i < (myarray.length); i++) {
        if (!(myarray[i].equals(null))) {
            arraysize++;
        }
    }
    return arraysize;
}
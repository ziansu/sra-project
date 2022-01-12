@java.lang.Override
public int hashCode() {
    int hash = 1;
    char[] array = data.array();
    int start = data.arrayOffset();
    int limit = (start + (fieldLengths[0])) + (fieldLengths[1]);
    for (int i = limit; i >= start; i--) {
        hash = (31 * hash) + ((int) (array[i]));
    }
    return hash;
}
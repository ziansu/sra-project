@java.lang.Override
public int begin() {
    for (index = 0; (index) < (matrix[v].length); (index)++) {
        if (matrix[v][index]) {
            return index;
        }
    }
    return -1;
}
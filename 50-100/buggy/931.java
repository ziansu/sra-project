@java.lang.Override
public int begin() {
    index = 0;
    for (int i = 0; i < (matrix[v].length); i++) {
        if (matrix[v][i]) {
            return i;
        }
    }
    return -1;
}
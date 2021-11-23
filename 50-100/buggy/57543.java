@java.lang.Override
public int[] getColumnWidths(int padding) {
    if ((this.colNumber) != ((this.ar.length) - 1)) {
        throw new java.lang.IllegalArgumentException("wrong columns array length: columns array length must be the same as the columns used to initialise the table");
    }
    int[] ret = org.apache.commons.lang3.ArrayUtils.addAll(new int[0], this.ar);
    return ret;
}
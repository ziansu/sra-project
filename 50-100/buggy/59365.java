@java.lang.Override
public java.lang.String toArrayString(char delim, java.lang.String[] array) {
    final java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.Math.max(64, ((array.length) * 8)));
    appendArray(sb, delim, array);
    return sb.toString();
}
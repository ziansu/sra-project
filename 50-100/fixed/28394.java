@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (length()); i += 1) {
        sb.append(java.lang.String.valueOf(bitAt(i)));
    }
    return sb.toString();
}
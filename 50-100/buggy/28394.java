@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = firstBitNum; i < (lastBitNum); i += 1) {
        sb.append(java.lang.String.valueOf(bitAt(i)));
    }
    return sb.toString();
}
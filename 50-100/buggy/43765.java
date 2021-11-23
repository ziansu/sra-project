@java.lang.Override
public void toString(java.lang.String prefix, java.lang.StringBuilder buffer) {
    buffer.append('(');
    int len = this.size;
    for (int i = 0; i < len; i++) {
        this.values[i].toString("", buffer);
        if ((i + 1) == len) {
            break;
        }
        buffer.append(", ");
    }
    buffer.append(')');
}
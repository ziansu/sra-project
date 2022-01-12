@java.lang.Override
public java.lang.String toString() {
    final java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (final java.lang.String string : this.keySet()) {
        builder.append(string).append(" : ").append(get(string)).append('\n');
    }
    return builder.toString();
}
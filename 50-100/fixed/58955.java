@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder().append(getFirstLineString());
    for (int i = (squares.length) - 1; i >= 0; i--) {
        builder.append(((java.lang.String.valueOf(squares[i])) + "\n"));
    }
    return builder.toString();
}
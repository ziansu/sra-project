@java.lang.Override
public org.la4j.matrix.Matrix removeLastColumn(org.la4j.factory.Factory factory) {
    return removeColumn(((columns) - 1), factory);
}
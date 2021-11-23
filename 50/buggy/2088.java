@java.lang.Override
public org.la4j.matrix.Matrix removeLastRow(org.la4j.factory.Factory factory) {
    return removeRow(((this.rows) - 1), factory);
}
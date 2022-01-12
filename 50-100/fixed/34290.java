@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof net.quasardb.qdb.QdbDoubleColumnCollection))
        return false;
    
    net.quasardb.qdb.QdbColumnCollection rhs = ((net.quasardb.qdb.QdbColumnCollection) (obj));
    return (super.equals(rhs)) && (this.column.equals(rhs.column));
}
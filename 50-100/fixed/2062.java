public boolean equalStruct(Expression o, java.util.HashMap<java.lang.String, java.lang.String> d) {
    if ((o == null) || ((o.instance) != (instance))) {
        return false;
    }
    BinaryOperation other = ((BinaryOperation) (o));
    return (((op) == (other.op)) && (lhs.equalStruct(other.lhs, d))) && (rhs.equalStruct(other.rhs, d));
}
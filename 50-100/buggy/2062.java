public boolean equalStruct(Expression o, java.util.HashMap<java.lang.String, java.lang.String> d, boolean type) {
    if ((o == null) || ((o.instance) != (instance))) {
        return false;
    }
    BinaryOperation other = ((BinaryOperation) (o));
    return (((op) == (other.op)) && (lhs.equalStruct(other.lhs, d, type))) && (rhs.equalStruct(other.rhs, d, type));
}
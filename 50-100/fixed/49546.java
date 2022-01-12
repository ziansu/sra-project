public boolean equalStruct(Expression o, java.util.HashMap<java.lang.String, java.lang.String> d) {
    return (!((o == null) || ((o.instance) != (instance)))) && (neg.equalStruct(((Negate) (o)).neg, d));
}
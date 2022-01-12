@com.oracle.truffle.api.dsl.Specialization
protected java.math.BigInteger add(java.math.BigInteger left, java.math.BigInteger right) {
    return left.add(right);
}
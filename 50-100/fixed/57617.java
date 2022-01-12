@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder output = new java.lang.StringBuilder().append('(').append(op);
    for (verifier.smtlib.S_Expression subexpression : subexpressions) {
        output.append(' ').append(subexpression.toString());
    }
    output.append(')');
    return output.toString();
}
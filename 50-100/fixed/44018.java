@java.lang.Override
public java.lang.String toString(java.lang.String indent) {
    return ((((((((indent + "<ExprArray>\n") + (expression.toString((indent + '\t')))) + indent) + "\t<ArrayName>\n") + (ident.toString(((indent + '\t') + '\t')))) + indent) + "\t</ArrayName>\n") + indent) + "</ExprArray>\n";
}
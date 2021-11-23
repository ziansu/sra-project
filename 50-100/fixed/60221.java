@java.lang.Override
public java.lang.String imprimNoeud(int indent) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < indent; ++i) {
        sb.append("-");
    }
    sb.append("> Conc\n");
    int newIndent = indent + 5;
    sb.append(getGauche().imprimNoeud(newIndent));
    sb.append(getDroit().imprimNoeud(newIndent));
    return sb.toString();
}
@java.lang.Override
public void present(java.lang.Appendable out, java.lang.String rootKey, java.lang.Object o) throws java.lang.Exception {
    this.out = out;
    out.append("var o={};\n");
    assign = new java.lang.StringBuilder();
    presentOne(rootKey, o, (-1), false);
    out.append(";\n").append(assign);
}
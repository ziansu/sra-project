@java.lang.Override
public void dump(java.lang.String indent, java.io.PrintWriter out) {
    if (!(indent.isEmpty())) {
        out.write(indent);
    }
    out.printf("%s %s %s", from.getId(), type.edgeOp, to.getId());
    super.dump(indent, out);
}
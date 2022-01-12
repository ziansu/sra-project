@java.lang.Override
public void dump(java.lang.String indent, java.io.PrintWriter out) {
    if (!(indent.isEmpty())) {
        out.write(indent);
    }
    out.printf("subgraph \"%s\"", id);
    super.dump(indent, out);
}
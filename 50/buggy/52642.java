@java.lang.Override
void appendImports(java.io.Writer w) throws java.io.IOException {
    super.appendImports(w);
    w.append("import java.util.List;").append("\n");
    w.append("import com.oracle.truffle.api.nodes.ExplodeLoop;").append("\n");
}
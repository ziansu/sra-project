@java.lang.Override
public void visit(io.koara.ast.BlockElement node) {
    if (((node.isNested()) && ((node.getParent()) instanceof io.koara.ast.ListItem)) && (node.isSingleChild())) {
        node.childrenAccept(this);
    }else {
        out.append(indent());
        node.childrenAccept(this);
        if (!(node.isNested())) {
            out.append("\n");
        }
    }
}
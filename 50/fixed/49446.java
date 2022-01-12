@java.lang.Override
public void visit(shadow.tac.nodes.TACClass.TACClassData node) throws shadow.parser.javacc.ShadowException {
    shadow.typecheck.type.Type type = node.getClassType();
    node.setData(classOf(type));
}
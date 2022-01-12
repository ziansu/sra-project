@java.lang.Override
public void caseAIdExp(AIdExp node) {
    inAIdExp(node);
    java.lang.String str = node.getId().toString().replace(" ", "");
    if ((node.getId()) != null) {
        node.getId().apply(this);
    }
    if ((node.getTuple()) != null) {
    }
    outAIdExp(node);
}
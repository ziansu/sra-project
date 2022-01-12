@java.lang.Override
public void visit(lambda.model.lambdaterm.LambdaRoot node) {
    if (result) {
        if (!(hasVisitedRoot)) {
            hasVisitedRoot = true;
            lambda.model.lambdaterm.LambdaUtils.getRoot(node).accept(this);
        }else {
            result &= ((node.getParent()) == null) && ((node.getChild()) != null);
            if ((node.getChild()) != null) {
                node.getChild().accept(this);
            }
        }
    }
}
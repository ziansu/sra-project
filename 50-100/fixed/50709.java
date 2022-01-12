@java.lang.Override
public void postOperationDec(edu.clemson.cs.r2jt.translation.OperationDec node) {
    if ((myCurrentPrivateProcedure) == null) {
        edu.clemson.cs.r2jt.translation.ST operation = myActiveTemplates.pop();
        myActiveTemplates.peek().add("functions", operation);
    }else {
        if ((node.getReturnTy()) != null) {
            addVariableTemplate(node.getReturnTy().getProgramTypeValue(), node.getName().getName());
        }
    }
}
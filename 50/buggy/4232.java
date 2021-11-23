@java.lang.Override
public java.util.ArrayList<org.w3c.dom.Node> visitRpNext(RpNextContext ctx) {
    java.util.ArrayList<org.w3c.dom.Node> curr = visit(ctx.left);
    stack.push(curr);
    java.lang.System.out.println("RPNext");
    return Utils.getUnique(visit(ctx.right));
}
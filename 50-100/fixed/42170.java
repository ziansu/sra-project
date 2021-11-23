@java.lang.Override
public void exitExprReturn(io.lambdacloud.exprengine.ExprGrammarParser.ExprReturnContext ctx) {
    io.lambdacloud.node.ReturnNode node = null;
    if (null != (ctx.expression())) {
        node = new io.lambdacloud.node.ReturnNode(this.currentScope().stack.pop(), null);
    }else {
        node = new io.lambdacloud.node.ReturnNode();
    }
    this.currentScope().stack.push(node);
}
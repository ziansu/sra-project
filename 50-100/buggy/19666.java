public Visitor.ExpressionAlgo visit(Visitor.Assignment stmt) {
    Visitor.ExpressionAlgo left = stmt.getLeft().accept(this);
    Visitor.ExpressionAlgo right = stmt.getRight().accept(this);
    Assembly.Sentence result = new Assembly.Sentence("MOV", right, null, left);
    sentence_list.add(result);
    return t0;
}
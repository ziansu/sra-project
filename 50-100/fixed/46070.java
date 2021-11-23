@java.lang.Override
public com.klq.logic.IKLQItem visit(com.klq.ComputedQuestionNode node) {
    com.klq.Id id = new com.klq.Id(node.getQuestionID());
    com.klq.Type type = node.getQuestionType();
    com.klq.Text text = new com.klq.Text(node.getText());
    com.klq.logic.expression.AExpression expr = ((com.klq.logic.expression.AExpression) (node.getChild().accept(this)));
    return new com.klq.Question(id, type, null, text, expr);
}
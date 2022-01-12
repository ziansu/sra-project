@java.lang.Override
public com.klq.logic.IKLQItem visit(com.klq.QuestionNode node) {
    com.klq.Id id = new com.klq.Id(node.getQuestionID());
    com.klq.Type type = node.getQuestionType();
    com.klq.Text text = new com.klq.Text(node.getText());
    return new com.klq.Question(id, type, null, text);
}
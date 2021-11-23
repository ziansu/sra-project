public static test.klq.logic.controller.Question q2() {
    test.klq.logic.controller.Id id = new test.klq.logic.controller.Id("question2");
    java.util.List<com.klq.logic.expression.AExpression> dependencies = new java.util.ArrayList<com.klq.logic.expression.AExpression>();
    com.klq.logic.expression.AExpression left = new test.klq.logic.controller.Identifier("question1");
    com.klq.logic.expression.AExpression right = new java.lang.Number("18");
    com.klq.logic.expression.operator.bool.GreaterEquals ge = new com.klq.logic.expression.operator.bool.GreaterEquals(left, right);
    dependencies.add(ge);
    test.klq.logic.controller.Text text = new test.klq.logic.controller.Text("Do you have a driving license?");
    test.klq.logic.controller.Question q = new test.klq.logic.controller.Question(id, Type.BOOLEAN, null, text, dependencies);
    return q;
}
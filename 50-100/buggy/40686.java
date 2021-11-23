protected void questionAnswered(@org.antlr.v4.runtime.misc.NotNull
java.lang.String result) {
    if (result.trim().isEmpty()) {
        controller.updateAnswer(question.getID(), new com.klq.ast.impl.value.UndefinedValue());
    }else
        if (isValidInput(result)) {
            com.klq.ast.impl.value.Value expr = com.klq.ast.impl.expr.ExpressionUtil.createTerminalFromString(question.getType(), result);
            controller.updateAnswer(question.getID(), expr);
        }
    
}
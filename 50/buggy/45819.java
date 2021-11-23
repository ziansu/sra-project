@java.lang.Override
public void visitForStatement(com.sixrr.stockmetrics.methodCalculators.PsiForStatement statement) {
    if (!(com.sixrr.stockmetrics.utils.ExpressionUtils.isEvaluatedAtCompileTime(statement.getCondition()))) {
        (count)++;
    }
    super.visitForStatement(statement);
}
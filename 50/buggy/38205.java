@java.lang.Override
public boolean visitBinaryExpressionWithType(com.android.tools.klint.checks.UBinaryExpressionWithType node) {
    if (org.jetbrains.uast.util.UastExpressionUtils.isTypeCast(node)) {
        visitTypeCastExpression(node);
    }
    return super.visitBinaryExpressionWithType(node);
}
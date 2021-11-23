@java.lang.Override
public boolean visit(final com.alibaba.druid.sql.ast.statement.SQLSelectItem x) {
    if (requireParameterizedOutput) {
        return super.visit(x);
    }
    return false;
}
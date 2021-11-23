@java.lang.Override
public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock.Limit x) {
    if (requireParameterizedOutput) {
        return super.visit(x);
    }
    return false;
}
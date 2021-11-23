public boolean visit(com.alibaba.druid.sql.visitor.SQLCreateTableStatement x) {
    printCreateTable(x);
    return false;
}
@java.lang.Override
protected void accept0(com.alibaba.druid.sql.visitor.SQLASTVisitor visitor) {
    com.alibaba.druid.sql.dialect.teradata.visitor.TeradataASTVisitor tdVisitor = ((com.alibaba.druid.sql.dialect.teradata.visitor.TeradataASTVisitor) (visitor));
    if (tdVisitor.visit(this)) {
        acceptChild(visitor, this.value);
    }
    tdVisitor.endVisit(this);
}
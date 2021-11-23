@java.lang.Override
public java.lang.String getMergeTemplate() {
    org.eclipse.xtend2.lib.StringConcatenation _builder = new org.eclipse.xtend2.lib.StringConcatenation();
    _builder.append("MERGE INTO ");
    java.lang.String _tableName = this.getTableName();
    _builder.append(_tableName);
    _builder.append(" (Id, Value) KEY (Id) VALUES (?, ?)");
    return _builder.toString();
}
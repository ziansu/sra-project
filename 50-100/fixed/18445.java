private static java.lang.String[] generateCreateViewHql(java.lang.String viewName, org.apache.kylin.metadata.model.TableDesc tableDesc) {
    java.lang.String dropsql = "DROP VIEW IF EXISTS " + viewName;
    java.lang.StringBuilder ddl = new java.lang.StringBuilder();
    ddl.append((((("CREATE VIEW " + viewName) + " AS SELECT * FROM ") + (tableDesc.getIdentity())) + "\n"));
    return new java.lang.String[]{ dropsql , ddl.toString() };
}
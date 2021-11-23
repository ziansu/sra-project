@org.junit.BeforeClass
public static void beforeClass() {
    com.orientechnologies.orient.core.sql.functions.sql.OCustomSQLFunctionsTest.db = new com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx(("memory:" + (com.orientechnologies.orient.core.sql.functions.sql.OCustomSQLFunctionsTest.class.getSimpleName())));
    com.orientechnologies.orient.core.sql.functions.sql.OCustomSQLFunctionsTest.db.create();
}
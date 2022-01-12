@org.junit.Before
public void setUp() throws java.lang.Exception {
    dbMapComponent = new org.talend.designer.dbmap.DbMapComponent();
    java.util.List<org.talend.core.model.process.IConnection> incomingConnections = new java.util.ArrayList<org.talend.core.model.process.IConnection>();
    conn = mock(org.talend.core.model.process.IConnection.class);
    incomingConnections.add(conn);
    dbMapComponent.setIncomingConnections(incomingConnections);
    oracleManager = new org.talend.designer.dbmap.language.oracle.OracleGenerationManager();
}
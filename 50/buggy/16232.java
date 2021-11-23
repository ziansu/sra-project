@org.junit.Ignore
@org.junit.Test
public void createRemoteDb() {
    com.orientechnologies.orient.object.db.OObjectDatabaseTx db = new com.orientechnologies.orient.object.db.OObjectDatabaseTx(Sprawl.remotedbstring);
    db.create();
    db.close();
}
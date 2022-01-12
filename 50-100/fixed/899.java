@org.junit.Test
public void testJocConfigurationWriteRecord() throws java.lang.Exception {
    initConnection();
    com.sos.jitl.joc.db.JocConfigurationDbItem jocConfigurationDbItem = new com.sos.jitl.joc.db.JocConfigurationDbItem();
    jocConfigurationDbItem.setAccount("root");
    jocConfigurationDbItem.setConfigurationItem("my configuration item");
    jocConfigurationDbItem.setConfigurationType("profil");
    jocConfigurationDbItem.setName("profil");
    jocConfigurationDbItem.setObjectType("profil");
    jocConfigurationDbItem.setInstanceId(61L);
    jocConfigurationDbItem.setShared(true);
    jocConfigurationDbItem.setConfigurationItem("myNewConfiguration");
    initFilter();
    jocConfigurationDBLayer.saveConfiguration(jocConfigurationDbItem);
    sosHibernateFactory.close();
}
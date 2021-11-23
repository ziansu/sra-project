@org.junit.Test
public void testAddContextPoint() throws java.lang.Exception {
    net.sharkfw.security.pki.storage.SharkKB testKB = new net.sharkfw.knowledgeBase.inmemory.InMemoSharkKB();
    net.sharkfw.security.pki.storage.SharkPkiStorage testStorage = new net.sharkfw.security.pki.storage.SharkPkiStorage(testKB, alice);
    net.sharkfw.security.pki.storage.Knowledge knowledge = net.sharkfw.security.pki.storage.SharkCSAlgebra.extract(this.sharkPkiStorage.getSharkPkiStorageKB(), contextCoordinatesFilter);
    net.sharkfw.security.pki.storage.ContextPoint cp = java.util.Collections.list(knowledge.contextPoints()).get(0);
    testStorage.addSharkCertificate(cp);
    org.junit.Assert.assertEquals(testStorage.getSharkCertificate(alice, bob), sharkCertificate);
}
@org.junit.Test
public final void addAcquaintanceTest() throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, java.security.SignatureException, nl.tudelft.bbw.exception.BlockAlreadyExistsException, nl.tudelft.bbw.exception.HashException {
    nl.tudelft.bbw.blockchain.Acquaintance pairedPerson = generateAcquaintanceForDemo(yourFriendName, yourFriendIban);
    java.util.List<nl.tudelft.bbw.blockchain.Block> list = nl.tudelft.bbw.API.getMyContacts();
    print(nl.tudelft.bbw.API.getMyContacts());
    nl.tudelft.bbw.API.addAcquaintance(pairedPerson);
    print(nl.tudelft.bbw.API.getMyContacts());
    nl.tudelft.bbw.API.addAcquaintance(pairedPerson);
    print(nl.tudelft.bbw.API.getMyContacts());
    org.junit.Assert.assertNotEquals(nl.tudelft.bbw.API.getMyContacts(), list);
}
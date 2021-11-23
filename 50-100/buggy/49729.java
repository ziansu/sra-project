@org.junit.Test
public void testConnectToWrongTransaction() {
    try {
        byte[] blockID = org.apache.commons.codec.binary.Hex.decodeHex("000000000000307b75c9b213f61b2a0c429a34b41b628daae9774cb9b5ff1059".toCharArray());
        byte[] transactionID = org.apache.commons.codec.binary.Hex.decodeHex("b6b55f7b4d004a788c751f3f8fc881f96c7b647ae06eb9a720bddc924e6f9147".toCharArray());
        org.provebit.proof.TransactionMerkleSerializer tm = new org.provebit.proof.TransactionMerkleSerializer();
        byte[] serial = tm.SerializedPathUpMerkle(transactionID, blockID);
        org.junit.Assert.assertTrue((serial == null));
    } catch (org.apache.commons.codec.DecoderException e) {
        org.junit.Assert.fail();
    }
}
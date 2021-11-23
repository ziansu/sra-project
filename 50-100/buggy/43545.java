@org.junit.Test
public void getAllBlocks() {
    java.lang.String owner2 = "owner2";
    nl.tudelft.b_b_w.Models.Block block2 = new nl.tudelft.b_b_w.Models.Block(owner2, 0, ownHash, previousHashChain, previousHashSender, publicKey, isRevoked);
    databaseHandler.addBlock(_block);
    databaseHandler.addBlock(block2);
    java.util.List<nl.tudelft.b_b_w.Models.Block> result = new java.util.ArrayList<>();
    result.add(block2);
    org.junit.Assert.assertEquals(databaseHandler.getAllBlocks(owner2), result);
}
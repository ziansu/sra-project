@org.junit.Before
public void setUpBlockData() {
    blockType = BlockType.ADD_KEY;
    sequenceNumber = 5;
    previousHashChain = new nl.tudelft.b_b_w.blockchain.Hash("ExampleHash1");
    previousHashSender = new nl.tudelft.b_b_w.blockchain.Hash("ExampleHash2");
    trustValue = TrustValues.INITIALIZED.getValue();
    blockData = new nl.tudelft.b_b_w.blockchain.BlockData(blockType, sequenceNumber, previousHashChain, previousHashSender, trustValue);
}
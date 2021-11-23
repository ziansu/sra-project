@org.junit.Test
public void testNonExistingFile() {
    dataloader = new com.sem.btrouble.tools.DataLoader("random");
    org.junit.Assert.assertFalse(dataloader.hasRoom(0));
}
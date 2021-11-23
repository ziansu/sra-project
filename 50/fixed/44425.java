@org.junit.Test
public void testNonExistingFile() {
    dataloader = new com.sem.btrouble.tools.DataLoader("random");
    assertFalse(dataloader.hasRoom(0));
}
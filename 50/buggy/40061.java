@org.junit.Test
public void selectTask_emptyList() {
    commandBox.runCommand("clear");
    assertListSize(0);
    assertSelectionInvalid(1);
}
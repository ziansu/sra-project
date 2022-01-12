public void testLauncherConvertArrayToList() {
    int[] values = new int[]{ 0 , 1 , 2 };
    listStart = ArrayUtilities.intArrayToList(values);
    listStart.printList();
}
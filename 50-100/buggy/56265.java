public static void PrintMasterList(java.util.ArrayList<java.util.ArrayList<Node>> masterList) {
    for (int i = 0; i < (masterList.size()); i++) {
        java.lang.System.out.print(java.lang.String.format("\nPrinting List# %d  : ", i));
        TestDataGenerator.PrintNodeList(masterList.get(i));
    }
}
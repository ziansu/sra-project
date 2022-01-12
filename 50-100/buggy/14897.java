public static void mainMenu() {
    de.tuhh.diss.io.SimpleIO.println();
    java.lang.System.out.println("*** Main Menu ***");
    java.lang.System.out.println("0: Quit Program");
    java.lang.System.out.println("1: Store a packet in the highbaystorage");
    java.lang.System.out.println("2: Retrieve a packet by description from the highbaystorage. Retrieves first match");
    java.lang.System.out.println("3: List and Retrieve packet from selection from the highbaystorage");
    de.tuhh.diss.io.SimpleIO.println();
    int choice = de.tuhh.diss.harborstorage.HarborStorageApp.readZeroOrPositiveIntInLoop("Your choice:");
    de.tuhh.diss.io.SimpleIO.println();
    de.tuhh.diss.harborstorage.HarborStorageApp.choice(choice);
}
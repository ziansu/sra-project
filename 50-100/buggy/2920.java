public static void main(java.lang.String[] args) {
    org.zahm.horsetrack.manager.InventoryManager inventoryManager = new org.zahm.horsetrack.manager.InventoryManager();
    org.zahm.horsetrack.manager.HorseManager horseManager = new org.zahm.horsetrack.manager.HorseManager();
    org.zahm.horsetrack.io.InputProcessor inputProcessor = new org.zahm.horsetrack.io.InputProcessor(inventoryManager, horseManager);
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    while (org.zahm.horsetrack.Main.isRunning) {
        inventoryManager.printStatus();
        horseManager.printStatus();
        java.lang.String command = input.nextLine();
        inputProcessor.processCommand(command);
    } 
}
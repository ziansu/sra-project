private void editSupplier() {
    java.lang.System.out.println("Select supplier you would like to edit.");
    Application.Supplier oldSupplier = consoleMenu.getSupplier();
    if (oldSupplier == null)
        return ;
    
    java.lang.System.out.printf("Supplier found: %s\nPlease enter your new information.\n", oldSupplier);
    Application.Supplier newSupplier = createSupplier(oldSupplier);
    database.EditSupplier(oldSupplier, newSupplier);
    java.lang.System.out.println("Supplier edited successfully!");
}
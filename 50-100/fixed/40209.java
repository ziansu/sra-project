public static void main(java.lang.String[] args) {
    Application.displayWelcomeMessage(java.lang.System.out);
    Warehouse.Warehouse warehouse = new Warehouse.Warehouse();
    Products.Catalogue catalogue = new Products.Catalogue();
    Basket.Basket basket = new Basket.Basket();
    new Ui.UserInterface(java.lang.System.in, new CatalogueActions.CatalogueActions(catalogue), new WarehouseActions.WarehouseActions(warehouse), new BasketActions.BasketActions(basket, catalogue, warehouse)).start();
    Application.displayGoodbyeMessage();
    java.lang.System.exit(0);
}
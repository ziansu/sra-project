public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    java.lang.System.out.println("init itemView");
    shoppingItems = main.iMat.getShoppingCart().getItems();
    main.iMat.getShoppingCart().addShoppingCartListener(this);
    int i = 14;
    while ((--i) > 1) {
        shoppingItems.add(new se.chalmers.ait.dat215.project.ShoppingItem(main.iMat.getProduct(i), 0));
    } 
    main.iMat.getShoppingCart().getTotal();
}
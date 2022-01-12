public com.forgaral.restaurant.model.Menu createMenu(int id, java.lang.String description, double price) {
    com.forgaral.restaurant.model.Menu menu = new com.forgaral.restaurant.model.Menu(java.lang.String.format(com.forgaral.restaurant.repository.MockMenuFactory.NAME_TEMPLATE, id));
    menu.setId(1);
    menu.setDescription(description);
    menu.setPrice(price);
    menu.setCurrency(java.util.Currency.getInstance(java.util.Locale.US));
    return menu;
}
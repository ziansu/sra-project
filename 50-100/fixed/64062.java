public void addItem(int id) {
    Item theItem = new Item();
    java.lang.System.out.println("Please enter the new Item's Name: ");
    theItem.setName(scanner.nextLine());
    java.lang.System.out.println("How many Items are there? ");
    theItem.setQuantity(java.lang.Integer.parseInt(scanner.nextLine()));
    java.lang.System.out.println("What is the price of the Item? ");
    theItem.setPrice(java.lang.Integer.parseInt(scanner.nextLine()));
    theItem.setId(id);
    items.add(theItem);
}
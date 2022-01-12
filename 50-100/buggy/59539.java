public void addItem(int id) {
    scanner.reset();
    Item theItem = new Item();
    java.lang.System.out.println("Please enter the new Item's Name: ");
    theItem.setName(scanner.nextLine());
    java.lang.System.out.println("How many Items are there? ");
    theItem.setQuantity(scanner.nextInt());
    java.lang.System.out.println("What is the price of the Item? ");
    theItem.setPrice(scanner.nextInt());
    theItem.setId(id);
    items.add(theItem);
}
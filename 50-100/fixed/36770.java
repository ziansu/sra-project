public void changePrice() {
    java.lang.System.out.println("Enter the name of the item you would like to update: ");
    java.lang.String itemName = scanner.nextLine();
    if (itemName.equalsIgnoreCase(findItemName(itemName))) {
        java.lang.System.out.println("What would you like to update the price to: ");
        int newPrice = java.lang.Integer.parseInt(scanner.nextLine());
        Item item = findItem(itemName);
        item.setPrice(newPrice);
        java.lang.System.out.println(("Your new price is " + (item.getPrice())));
    }else {
        java.lang.System.out.println("The item name you entered does not exist.");
    }
}
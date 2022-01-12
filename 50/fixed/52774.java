public void DiscoverItem() {
    java.lang.String type = currentRoom.item.type;
    java.lang.System.out.println((("You have found a " + type) + ". Would you like to pick it up?"));
    char userInput = stdin.next();
    if (userInput = "y")
        pickupItem(currentItem);
    
}
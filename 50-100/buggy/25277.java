public void removeItem() {
    int index = -1;
    java.lang.System.out.println("Please enter the 'NUMBER' of the item you'd like to remove: ");
    int idToRemove = scanner.nextInt();
    for (int i = 0; i <= (items.size()); i++) {
        Item current = items.get(i);
        if ((current.getId()) == idToRemove) {
            items.remove(i);
            java.lang.System.out.println("Yay! Successful removal!");
        }
    }
}
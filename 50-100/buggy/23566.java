private void goRoom(Command command) {
    if (!(command.hasSecondWord())) {
        java.lang.System.out.println("Go where?");
        return ;
    }
    java.lang.String direction = command.getSecondWord();
    Room nextRoom = currentRoom.getExit(direction);
    if (nextRoom == null) {
        java.lang.System.out.println("There is no door!");
    }else {
        currentRoom = nextRoom;
        currentRoom.setSearched(false);
        java.lang.System.out.println(currentRoom.getLongDescription());
    }
}
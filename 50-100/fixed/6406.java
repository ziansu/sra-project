private void goRoom(zuulFramework.worldofzuul.Command command) {
    if (!(command.hasSecondWord())) {
        java.lang.System.out.println("Go where?");
        return ;
    }
    zuulFramework.worldofzuul.Room nextRoom = player.goRoom(command.getSecondWord());
    if (nextRoom == null) {
        java.lang.System.out.println("There is no door!");
    }else {
        java.lang.System.out.println(nextRoom.getLongDescription());
    }
}
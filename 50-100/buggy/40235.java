private void eat(Command command) {
    if (!(command.hasSecondWord())) {
        java.lang.System.out.println("What do you want to eat?");
        return ;
    }
    java.lang.String itemDesciption = command.getSecondWord();
    Item item = player.eat(item.getDescription());
    if (item == null) {
        java.lang.System.out.println(("Could not eat " + (item.getDescription())));
    }else {
        java.lang.System.out.println(("Ate " + (item.getDescription())));
    }
}
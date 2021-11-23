private void printWelcome() {
    @java.lang.SuppressWarnings(value = "resource")
    java.util.Scanner keyboard = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Welcome to Road to Zion. Please enter your name: ");
    java.lang.String name = keyboard.nextLine();
    mainCharacter.setCharacterName(textCheck(name));
    java.lang.System.out.println("Please press enter after each line.");
    keyboard.nextLine();
    intro(name);
    java.lang.System.out.println(currentRoom.longDescription());
}
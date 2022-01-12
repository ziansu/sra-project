@java.lang.Override
public void printMenuForPokemon(pokemon.Pokemon pokemon) {
    java.lang.System.out.println("[0]Exit");
    java.lang.System.out.println("[1]View abilities");
    java.lang.System.out.println("[2]Change name");
    int choice = main.ConsoleRenderer.input.nextInt();
    if (choice == 1) {
        printAbilities(pokemon);
    }else
        if (choice == 2) {
            java.lang.System.out.print("Insert the new name: ");
            pokemon.setName(main.ConsoleRenderer.input.next());
        }else
            if (choice == 0) {
                printMenu();
            }
        
    
}
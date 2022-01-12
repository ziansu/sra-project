@java.lang.Override
public void chooseOnePokemon() {
    int choice = 0;
    int chosenPokemon = 0;
    do {
        chosenPokemon = 0;
        printStarterPokemon();
        chosenPokemon = getChosen();
        java.lang.System.out.println("Do you choose him?");
        java.lang.System.out.println("[1]Yes      [2]No");
        choice = main.ConsoleRenderer.input.nextInt();
        if (choice == 2) {
            chooseOnePokemon();
            break;
        }else
            if (choice != 1) {
                java.lang.System.out.println("Choose Yes or No!");
            }
        
    } while (choice != 1 );
    main.Player.choosePokemon(chosenPokemon);
    java.lang.System.out.println("Successufully added a pokemon");
}
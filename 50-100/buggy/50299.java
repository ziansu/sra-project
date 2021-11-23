private void doAction(char input, Control.PlayerControls playerControls) {
    switch (input) {
        case 'N' :
        case 'E' :
        case 'S' :
        case 'W' :
            playerControls.move(input);
            break;
        case 'H' :
            java.lang.System.out.println(HELPMENU);
        default :
            java.lang.System.out.println((input + "is not a Invalid Input"));
    }
}
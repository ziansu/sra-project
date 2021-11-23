public static void game() {
    arrayinput.ArrayInput.intro();
    arrayinput.ArrayInput.traps();
    arrayinput.ArrayInput.chests();
    while (arrayinput.ArrayInput.play) {
        while (arrayinput.ArrayInput.play) {
            arrayinput.ArrayInput.playGame();
        } 
        arrayinput.ArrayInput.playAgain();
    } 
}
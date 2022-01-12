public void run() {
    boolean loop = true;
    while (loop) {
        clear();
        printHangman();
        printWord();
        if (((hp) > 0) && ((solved) == false)) {
            getGuess();
        }else {
            loop = false;
        }
    } 
    if (solved) {
        java.lang.System.out.println("\n----PLAYER 2 WINS----");
    }else {
        java.lang.System.out.println(("\n---PLAYER 1 WINS---\n The Word is " + (words.toUpperCase())));
    }
}
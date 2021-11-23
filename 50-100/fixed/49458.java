private static void isTrapped(int pX, int pY) {
    for (int[] trap : arrayinput.ArrayInput.traps) {
        if ((pX == (trap[0])) && (pY == (trap[1]))) {
            java.lang.System.out.println("Ouch! -50 health!");
            arrayinput.ArrayInput.player.health -= 50;
        }
    }
}
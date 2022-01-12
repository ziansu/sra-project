private static void chestFound(int pX, int pY) {
    for (int[] chest : arrayinput.ArrayInput.chests) {
        if ((pX == ((chest[0]) + 1)) && (pY == ((chest[1]) + 1))) {
            chest[0] = 0;
            chest[1] = 0;
            java.lang.System.out.println("You found a chest. + 5 Points");
            arrayinput.ArrayInput.points += 5;
        }
    }
}
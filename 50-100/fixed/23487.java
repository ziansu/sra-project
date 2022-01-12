private static java.lang.String throwComputer() {
    java.util.Random rand = new java.util.Random(java.lang.System.currentTimeMillis());
    int randNum;
    randNum = rand.nextInt(tk.salvador_nico.rockpaperscissors.GameUtils.gameModeChoices);
    switch (randNum) {
        case 0 :
            tk.salvador_nico.rockpaperscissors.GameUtils.aiThrow = "Rock";
            break;
        case 1 :
            tk.salvador_nico.rockpaperscissors.GameUtils.aiThrow = "Paper";
            break;
        case 2 :
            tk.salvador_nico.rockpaperscissors.GameUtils.aiThrow = "Scissors";
            break;
        case 3 :
            tk.salvador_nico.rockpaperscissors.GameUtils.aiThrow = "Lizard";
            break;
        case 4 :
            tk.salvador_nico.rockpaperscissors.GameUtils.aiThrow = "Spock";
    }
    return tk.salvador_nico.rockpaperscissors.GameUtils.aiThrow;
}
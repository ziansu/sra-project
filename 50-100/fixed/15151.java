private static void stringToColor(java.lang.String s) {
    switch (s) {
        case "BLUE" :
            teamfmg.hangman.Settings.theme = teamfmg.hangman.Settings.Theme.BLUE;
            break;
        case "GREEN" :
            teamfmg.hangman.Settings.theme = teamfmg.hangman.Settings.Theme.GREEN;
            break;
        case "ORANGE" :
            teamfmg.hangman.Settings.theme = teamfmg.hangman.Settings.Theme.ORANGE;
            break;
        case "PURPLE" :
            teamfmg.hangman.Settings.theme = teamfmg.hangman.Settings.Theme.PURPLE;
            break;
        default :
            teamfmg.hangman.Logger.logOnly("Couldn't string to color!");
    }
}
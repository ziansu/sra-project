static int checkColor(java.lang.String newGuess) {
    if ((newGuess.length()) != (GameConfiguration.pegNumber)) {
        return 1;
    }
    for (int i = 0; i <= (GameConfiguration.pegNumber); i++) {
        if (!(java.util.Arrays.asList(GameConfiguration.colors).contains(newGuess.charAt(i))))
            return 0;
        
    }
    return 1;
}
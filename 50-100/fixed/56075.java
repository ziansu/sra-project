private void generateCode() {
    pegs = new java.lang.String[GameConfiguration.pegNumber];
    for (int i = 0; i < (pegs.length); i++) {
        int colorindex = ((int) (java.lang.Math.round(((java.lang.Math.random()) * ((GameConfiguration.colors.length) - 1)))));
        pegs[i] = GameConfiguration.colors[colorindex];
    }
}
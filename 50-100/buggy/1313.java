public void runGames(int numberOfGames, boolean commandLine) {
    Statistics stats = new Statistics();
    for (int i = 0; i < numberOfGames; i++) {
        stats.updateStatistics(doors);
        oneGame();
    }
    if (commandLine == true) {
        java.lang.System.out.println(stats.toString());
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, stats.toString(), "Enter a valid input: ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    java.lang.System.out.println(stats.toString());
}
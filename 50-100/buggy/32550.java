public int getNumPlayers() {
    java.lang.Object[] options = new java.lang.Object[]{ 2 , 3 , 4 , 5 , 6 };
    int numPlayers = ((int) (javax.swing.JOptionPane.showInputDialog(((javax.swing.JFrame) (this)), "How many players?", "Welcome to Cluedo!", javax.swing.JOptionPane.PLAIN_MESSAGE, null, options, options[0])));
    return numPlayers;
}
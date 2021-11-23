public boolean checkForWinner() {
    for (Car c : cars)
        if (c.checkWin()) {
            javax.swing.JOptionPane.showMessageDialog(null, ((((("We have a winner!\nCar " + (c.getRacingNumber())) + " has won!\nDistance traveled by Car ") + (c.getRacingNumber())) + " : ") + (c.getDistanceTraveled())));
            return true;
        }
    
    return false;
}
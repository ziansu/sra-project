public void act() {
    boolean willMove = canMove();
    if ((isEnd) == true) {
        if ((hasShown) == false) {
            java.lang.String msg = (stepCount.toString()) + " steps";
            javax.swing.JOptionPane.showMessageDialog(null, msg);
            hasShown = true;
        }
    }else
        if (willMove) {
            move();
            (stepCount)++;
        }
    
}
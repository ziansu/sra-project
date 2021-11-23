public void act() {
    boolean willMove = canMove();
    if (isEnd) {
        if (!(hasShown)) {
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
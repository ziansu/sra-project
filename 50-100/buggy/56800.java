void check() {
    try {
        if ((g.check()) == (eboard._N))
            return ;
        
        java.lang.String s = g.getWin();
        f = false;
        bor.win(s, g.check());
    } catch (gui.NoMoveException e) {
        javax.swing.JOptionPane.showMessageDialog(bor, e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}
void check() {
    try {
        if ((!(f)) || ((g.check()) == (eboard._N)))
            return ;
        
        java.lang.String s = g.getWin();
        bor.win(s, g.check());
    } catch (gui.NoMoveException e) {
        f = false;
        java.lang.System.out.println(f);
        javax.swing.JOptionPane.showMessageDialog(bor, e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}
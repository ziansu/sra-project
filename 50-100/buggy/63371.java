public void open() {
    this.mark = false;
    if (this.mine) {
        javax.swing.JOptionPane.showMessageDialog(this, "Hävisit");
        this.openAll();
    }else {
        this.close = false;
        if ((neightborhoodBOOMCount()) == 0) {
            for (fi.gosu.miinaharava.Hopscotch hopscotch : neighborhood) {
                if ((hopscotch != null) && (hopscotch.isClose())) {
                    hopscotch.open();
                }
            }
        }
    }
}
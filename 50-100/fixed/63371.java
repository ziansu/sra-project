public boolean open() {
    this.mark = false;
    if (this.mine) {
        return false;
    }else {
        this.close = false;
        if ((neightborhoodBOOMCount()) == 0) {
            for (fi.gosu.miinaharava.Hopscotch hopscotch : neighborhood) {
                if ((hopscotch != null) && (hopscotch.isClose())) {
                    hopscotch.open();
                }
            }
        }
        return true;
    }
}
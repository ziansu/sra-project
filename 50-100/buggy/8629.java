public boolean fits(guitarchordmaker.Accord owning) {
    return ((((this.id) == (Accord.Coms.drawLines12)) || ((this.id) == (Accord.Coms.drawLines6))) || ((this.six) && ((this.row) < ((owning.seitenzahle) - 1)))) || ((!(this.six)) && ((this.row) <= (owning.seitenzahle)));
}
private boolean canigoup() {
    fdelta = BarbarianHorde.playerguy.getpdelta();
    return (!(isBlocked(this.Bx, ((this.By) - (fdelta))))) || (!(isBlocked((((this.Bx) + (SIZE)) - 1), ((this.By) - (fdelta)))));
}
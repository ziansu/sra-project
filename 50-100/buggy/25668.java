private boolean canigoup() {
    fdelta = BarbarianHorde.playerguy.getpdelta();
    return (!(isBlocked(this.Bx, ((this.By) - (fdelta))))) || (!(isBlocked(((float) (((this.Bx) + (SIZE)) + 1.5)), ((this.By) - (fdelta)))));
}
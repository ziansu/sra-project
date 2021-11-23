public java.lang.String mark(int pos) {
    if ((yourField.at(pos)) == '~') {
        return "missed!\n";
    }
    java.lang.String hitstr = "";
    hitstr = yourField.addHit(pos);
    if (hitstr.contains("sunk"))
        (this.shipsDestroyed)++;
    
    return hitstr;
}
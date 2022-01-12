public void prepare() throws org.drtshock.NotDeliciousException {
    this.addCondiments("sour cream", "chives", "butter", "crumbled bacon", "grated cheese", "ketchup", "salt", "tabasco");
    this.listCondiments();
    if (!(this.isDelicious()))
        throw new org.drtshock.NotDeliciousException();
    
}
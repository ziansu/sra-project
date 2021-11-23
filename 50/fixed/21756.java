public void setModDefesa(int armadura) {
    if (armadura < 0) {
        this.modDefesa = 0;
    }else
        if (armadura > 100) {
            this.modDefesa = 100;
        }else {
            this.modDefesa = armadura;
        }
    
}
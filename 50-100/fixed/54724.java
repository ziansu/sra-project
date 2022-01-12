public int getAction(java.lang.Object caller) {
    if (caller instanceof duel.Duel) {
        int descision = this.rand.nextInt(2);
        if (descision == (this.defending)) {
            return 2;
        }else {
            if (this.loaded) {
                this.loaded = false;
                return 1;
            }else {
                this.loaded = true;
                return 0;
            }
        }
    }
    return 3;
}
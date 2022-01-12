public void setSize(int s) {
    this.size = s;
    if ((subEffects) != null) {
        for (CAVERNOS.Effect se : subEffects) {
            se.setSize(s);
        }
    }
}
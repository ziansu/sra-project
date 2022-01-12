public void decreaseHealth(int plantEff) {
    this.health -= plantEff;
    this.RunoffParticles -= 1;
    setrunoffC(this);
    if ((this.health) <= 0) {
        this.removed = true;
    }else {
        wimg = new javax.swing.ImageIcon(water.getScaledInstance(health, scaledimagey, 20));
        this.getWbutton().setIcon(wimg);
    }
}
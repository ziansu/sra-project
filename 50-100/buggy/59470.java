public void polymorph() {
    java.lang.System.out.println("THIS RUNS");
    int oldMovement = this.getStatValue("Movement");
    int changedMovement = 2;
    this.setStatValue("Movement", changedMovement);
    buffTime = new javax.swing.Timer(500, new model.entity.Entity.PolymorphTimer("Movement", oldMovement));
    makeAlternateSpriteArray();
    buffTime.start();
}
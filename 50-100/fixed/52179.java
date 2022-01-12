public void takeDamage(int damage) {
    hp -= damage;
    this.model.setFlash(true);
    if ((this) instanceof scrollthief.model.Boss) {
        scrollthief.model.Character boss = gameModel.getBoss();
        boss.takeDamage(damage);
    }else
        if ((this) instanceof scrollthief.model.Ninja) {
        }
    
}
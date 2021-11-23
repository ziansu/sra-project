private void addToOrder(java.lang.String name, int health) {
    this.lMob.add(new DChar(name, health));
    if (!(this.enemyIn)) {
        this.lOrd.add(new DChar("ENEMIES"));
        this.enemyIn = true;
    }
    if ((this.lOrd.size()) == 1) {
        this.lOrd.get(0).changeTop();
    }
    java.lang.System.out.println(("Added Mob: " + name));
}
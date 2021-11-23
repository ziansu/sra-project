public void drive() {
    fuel -= 10;
    forwardProgress += 200;
    int chance = ((int) (java.lang.Math.random())) * 100;
    if (chance <= 20)
        (tires)--;
    
    this.fillGas();
}
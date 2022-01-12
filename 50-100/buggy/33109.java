public int rangedAttack() {
    int dam;
    if ((rangedCD) == 0) {
        rng = new java.util.Random();
        dam = (super.damage()) / 2;
        rangedCD = rng.nextInt(3);
    }else {
        dam = 0;
        rangedCD -= 1;
    }
    return dam;
}
private void attackClose(gladiator.Gladiator en, gladiator.Gladiator target) {
    if (((java.lang.Math.abs(((en.getX()) - (target.getX())))) < 10) && ((java.lang.Math.abs(((en.getY()) - (target.getY())))) < 10))
        attack(target, 1);
    
}
public void cast(GamepProject01.FFMOBA.Hero caster, GamepProject01.FFMOBA.Hero target) throws java.io.IOException {
    if ((this.getManaCost()) <= (caster.getCurrentMana())) {
        caster.setCurrentMana(((caster.getCurrentMana()) - (this.getManaCost())));
        target.receiveDamage(caster, this);
    }else {
        java.lang.System.out.println("Not enough Mana!");
    }
}
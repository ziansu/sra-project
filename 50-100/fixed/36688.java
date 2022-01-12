public boolean isMaterial() {
    return ((((this.AttackArray[0]) == 1) && ((this.Cost) == 99)) && ((this.getRace()) < 5)) && ((((this.getSkill2()) == null) || (this.getSkill2().equals(""))) || (this.getSkill2().equals("0")));
}
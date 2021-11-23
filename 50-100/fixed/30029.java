public void attack() {
    if ((target) != null)
        target.setHitPoints((((target.getHitPoints()) - (this.getPhysicalDamage())) - (this.getMagicalDamage())));
    
    target = null;
}
public void attack() {
    Server.Domain.ITarget target = this.getITarget();
    if (target != null)
        target.setHitPoints((((target.getHitPoints()) - (this.getPhysicalDamage())) - (this.getMagicalDamage())));
    
}
private void attack(com.cardshifter.modapi.actions.attack.DamageEvent event) {
    if ((trampleRes.getOrDefault(event.getDamagedBy(), 0)) <= 0) {
        return ;
    }
    int overload = (event.getDamage()) - (health.getFor(event.getTarget()));
    if (overload > 0) {
        com.cardshifter.modapi.base.Entity owner = com.cardshifter.modapi.cards.Cards.getOwner(event.getTarget());
        health.resFor(owner).change((-overload));
    }
}
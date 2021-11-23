public void update(float cost) {
    for (Roguelike.Ability.ActiveAbility.ActiveAbility a : slottedActiveAbilities) {
        if (a != null) {
            boolean gtz = (a.cooldownAccumulator) > 0;
            a.cooldownAccumulator -= cost;
            if (gtz && ((a.cooldownAccumulator) <= 0)) {
                GameScreen.Instance.addAbilityAvailabilityAction(a.Icon);
            }
            if ((a.cooldownAccumulator) < 0) {
                a.cooldownAccumulator = 0;
            }
        }
    }
}
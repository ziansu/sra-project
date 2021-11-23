@java.lang.Override
public mage.abilities.SpellAbility getSpellAbility() {
    if ((spellAbility) == null) {
        for (mage.abilities.Ability ability : abilities.getActivatedAbilities(Zone.HAND)) {
            if (ability instanceof mage.abilities.SpellAbility) {
                spellAbility = ((mage.abilities.SpellAbility) (ability));
            }
        }
    }
    return spellAbility;
}
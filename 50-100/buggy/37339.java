@java.lang.Override
public mage.abilities.SpellAbility getSpellAbility() {
    if ((spellAbility) == null) {
        for (mage.abilities.Ability ability : abilities.getActivatedAbilities(Zone.HAND)) {
            if ((ability instanceof mage.abilities.SpellAbility) && (ability.toString().endsWith(getName()))) {
                spellAbility = ((mage.abilities.SpellAbility) (ability));
            }
        }
    }
    return spellAbility;
}
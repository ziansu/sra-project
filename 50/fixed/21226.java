private void improvedShadowWordPain(int pointsSpent) {
    if (pointsSpent <= 0) {
        return ;
    }
    se.wowsim.spells.types.Spell affectedSpell = spells.get("Shadow Word: Pain");
    increaseDuration(((se.wowsim.spells.types.DamageOverTime) (affectedSpell)), (pointsSpent * 30));
}
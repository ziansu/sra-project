private void improvedMindBlast(int pointsSpent) {
    if (pointsSpent <= 0) {
        return ;
    }
    se.wowsim.spells.types.Spell affectedSpell = spells.get("Mind Blast");
    reduceCooldown(affectedSpell, (pointsSpent * 5));
}
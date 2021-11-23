public int getMAttackFighter() {
    return ((int) (((((getMatk()) + (m_equippedSword.getBonusMAtk())) + (m_equippedShield.getBonusMAtk())) + (m_equippedHelmet.getBonusMAtk())) * (getMatkModifier())));
}
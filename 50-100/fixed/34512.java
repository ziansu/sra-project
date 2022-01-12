public int getMAttackFighter() {
    if ((m_equippedSword) == null) {
        return ((int) ((getMatk()) * (getMatkModifier())));
    }else {
        return ((int) (((((getMatk()) + (m_equippedSword.getBonusMAtk())) + (m_equippedShield.getBonusMAtk())) + (m_equippedHelmet.getBonusMAtk())) * (getMatkModifier())));
    }
}
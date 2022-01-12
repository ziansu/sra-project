public int getMDefenseFighter() {
    return ((int) (((((getMdef()) + (m_equippedSword.getBonusMDef())) + (m_equippedShield.getBonusDef())) + (m_equippedHelmet.getBonusMDef())) * (getMdefModifier())));
}
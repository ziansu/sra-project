public int getMDefenseFighter() {
    if ((m_equippedSword) == null) {
        return ((int) ((getMdef()) * (getMdefModifier())));
    }else {
        return ((int) (((((getMdef()) + (m_equippedSword.getBonusMDef())) + (m_equippedShield.getBonusDef())) + (m_equippedHelmet.getBonusMDef())) * (getMdefModifier())));
    }
}
@org.junit.Test
public void affectCreature() {
    entity.item.wearable.armor.Armor armor = createArmor();
    armor.affect(mockCreature);
    org.mockito.Mockito.verify(mockCreature.addArmorToInventory(armor));
}
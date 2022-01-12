@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.util.List<?> data = availableTable.getSelectedData();
    if (data != null) {
        for (java.lang.Object object : data) {
            if (object instanceof pcgen.facade.core.EquipmentFacade) {
                pcgen.facade.core.EquipmentFacade equip = ((pcgen.facade.core.EquipmentFacade) (object));
                if (character.isAutoResize()) {
                    equip = character.getEquipmentSizedForCharacter(equip);
                }
                character.addPurchasedEquipment(equip, 1, true);
            }
        }
    }
}
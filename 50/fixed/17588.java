@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    for (pcgen.facade.core.EquipmentFacade item : targets) {
        character.removePurchasedEquipment(item, 1, true);
        destination.addPurchasedEquipment(item, 1, false, true);
    }
}
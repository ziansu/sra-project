@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.util.List<?> data = purchasedTable.getSelectedData();
    if (data != null) {
        for (java.lang.Object object : data) {
            character.removePurchasedEquipment(((pcgen.facade.core.EquipmentFacade) (object)), 1);
        }
        availableTable.refilter();
    }
}
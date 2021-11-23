@java.lang.Override
public void run() {
    models.items.takeable.TakeableItem currentItem = itemNodeArrayList.get(selectedItemIndex).getItem();
    if (currentItem.isEquipable()) {
        entity.equipItem(((models.items.takeable.equippable.EquippableItem) (currentItem)));
    }else {
    }
    (selectedItemIndex)--;
    if ((selectedItemIndex) < 0)
        selectedItemIndex = 0;
    
    ((views.InventoryView) (view)).updateSelected(selectedItemIndex);
}
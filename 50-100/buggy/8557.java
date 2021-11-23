@java.lang.Override
public void run() {
    models.items.takeable.TakeableItem currentItem = itemNodeArrayList.get(selectedItemIndex).getItem();
    if (currentItem.isEquipable()) {
        entity.equipItem(((models.items.takeable.equippable.EquippableItem) (currentItem)));
    }else {
    }
    (selectedItemIndex)--;
    ((views.InventoryView) (view)).updateSelected(selectedItemIndex);
}
@java.lang.Override
public void onClick(android.view.View v) {
    if (weapon.isEquipped()) {
        weapon.equip(false);
        button.getBackground().setColorFilter(null);
    }else
        if ((ship.getEquippedWeapons().size()) < (at.hakkon.space.fragments.ShipFragment.MAX_WEAPONS_EQUIP_COUNT)) {
            button.getBackground().setColorFilter(colorSelected, PorterDuff.Mode.DARKEN);
            weapon.equip(true);
        }
    
    refreshInventory(ship);
}
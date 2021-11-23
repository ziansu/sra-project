@org.junit.Test
public void DoubleSlotsHasNot() {
    model.slots.SmasherWeaponSlot weapon = new model.slots.SmasherWeaponSlot();
    model.slots.EquipmentSlot<model.item.Shield> shield = new model.slots.EquipmentSlot<model.item.Shield>();
    model.slots.DoubleEquipmentSlot<model.item.TwoHandedWeapon, model.item.SmasherWeapon, model.item.Shield> THWSlot = new model.slots.DoubleEquipmentSlot<model.item.TwoHandedWeapon, model.item.SmasherWeapon, model.item.Shield>(weapon, shield);
    org.junit.Assert.assertFalse(slots.THW.has());
}
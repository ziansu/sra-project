public static void addElement(java.lang.String name, int power, java.lang.String serialNumber) {
    try {
        JavafxLab6.Equipment equip = new JavafxLab6.Equipment(name, power, serialNumber);
        JavafxLab6.Equipments.map.put(equip.getSerialNumber(), equip);
        JavafxLab6.Equipments.showAddAcceptDilog();
    } catch (java.io.IOException e) {
    }
}
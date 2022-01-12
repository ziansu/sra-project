public logic.Equipment getEquipment(java.lang.Object key) {
    if ((codeToEquipmentTable) == null) {
        return null;
    }
    return codeToEquipmentTable.get(key);
}
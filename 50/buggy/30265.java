public int update(models.Equipment equipment) throws java.sql.SQLException {
    models.Equipment e = this.equipmentRepository.get(equipment.getId());
    if (e == null) {
        return models.status.EquipmentStatus.NOT_FOUND;
    }
    this.equipmentRepository.update(equipment);
    return models.status.EquipmentStatus.OK;
}
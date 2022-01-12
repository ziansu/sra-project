public int softDelete(int id) throws java.sql.SQLException {
    switch (this.equipmentRepository.softDelete(id)) {
        case 0 :
            return models.status.EquipmentStatus.NOT_FOUND;
    }
    return models.status.EquipmentStatus.OK;
}
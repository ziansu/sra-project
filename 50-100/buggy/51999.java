@javax.transaction.Transactional
public java.util.List<com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAssignment> saveHousingUnitAssignments(java.util.List<com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAssignment> housingUnitAssignments, java.util.UUID housingUnitId) {
    com.hserv.coordinatedentry.housinginventory.domain.HousingInventory housingInventory = HousingInventoryRepository.findOne(housingUnitId);
    for (com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAssignment housingUnitAssignment : housingUnitAssignments) {
        housingUnitAssignment.setHousingInventory(housingInventory);
        housingUnitAssignment.setAssignmentId(java.util.UUID.randomUUID());
        housingUnitAssignment = housingUnitAssignmentRepository.save(housingUnitAssignment);
    }
    return housingUnitAssignments;
}
public void delete(java.util.UUID id) {
    com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAssignment housingUnitAssignment = housingUnitAssignmentRepository.findOne(id);
    housingUnitAssignmentRepository.delete(housingUnitAssignment);
}
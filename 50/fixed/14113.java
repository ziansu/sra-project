@javax.transaction.Transactional
public com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAssignment saveHousingUnitAssignment(com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAssignment housingUnitAssignments) {
    housingUnitAssignments = housingUnitAssignmentRepository.save(housingUnitAssignments);
    return housingUnitAssignments;
}
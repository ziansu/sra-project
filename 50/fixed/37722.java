public void delete(java.util.UUID id) {
    housingUnitAssignmentRepository.delete(housingUnitAssignmentRepository.findOne(id));
}
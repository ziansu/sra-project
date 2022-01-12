@org.junit.Test
public void testReturnCorrectMpiIdentifierTypeId() throws java.lang.Exception {
    identifierMapper.init();
    java.lang.String mpiIdentifierTypeId = identifierMapper.getMappedMpiIdentifierTypeId(org.openmrs.module.registrationcore.api.mpi.openempi.PatientIdentifierMapperTest.PROPERTY_LOCAL_PART.toString());
    org.junit.Assert.assertEquals(mpiIdentifierTypeId, org.openmrs.module.registrationcore.api.mpi.openempi.PatientIdentifierMapperTest.PROPERTY_MPI_PART.toString());
}
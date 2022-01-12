@org.junit.Test
public void shouldRemoveOppositeElementForSUMOperation() {
    sumOperationUUT = new es.uam.eps.tfg.CAS.CASOperations.SUM(es.uam.eps.tfg.CAS.CASTypes.CASList.concat(new es.uam.eps.tfg.CAS.CASTypes.CASNumber(2), new es.uam.eps.tfg.CAS.CASOperations.NEG(new es.uam.eps.tfg.CAS.CASTypes.CASNumber(2))));
    final boolean expectedResult = sumOperationUUT.identitySUM();
    org.junit.Assert.assertTrue(expectedResult);
    org.junit.Assert.assertEquals(0, sumOperationUUT.getValue());
}
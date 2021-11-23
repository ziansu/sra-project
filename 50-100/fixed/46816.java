@org.junit.Test
public void testCreateIntervention() {
    entity.Intervention intervention = new entity.Intervention("Intervention 1", "263 Avenue Général Leclerc", "35000", "Rennes", entity.DisasterCode.FHA);
    service.impl.RetrieveAddressImpl adresseIntervention = new service.impl.RetrieveAddressImpl(intervention.getAddress(), intervention.getPostcode(), intervention.getCity());
    entity.Position coordinatesIntervention = adresseIntervention.getCoordinates();
    intervention.setCoordinates(coordinatesIntervention);
    java.lang.System.out.println(intervention.getId());
    dao.InterventionDAOTest.dao.create(intervention);
}
@org.junit.Test
public void testModelSerializer(org.baderlab.csplugins.enrichmentmap.model.EnrichmentMapManager emManager) {
    org.baderlab.csplugins.enrichmentmap.model.EnrichmentMap expectedEM = emManager.getAllEnrichmentMaps().values().iterator().next();
    org.junit.Assert.assertNotNull(expectedEM);
    java.lang.String json = org.baderlab.csplugins.enrichmentmap.model.io.ModelSerializer.serialize(expectedEM);
    org.baderlab.csplugins.enrichmentmap.model.EnrichmentMap roundTripEM = org.baderlab.csplugins.enrichmentmap.model.io.ModelSerializer.deserialize(json);
    org.baderlab.csplugins.enrichmentmap.model.ModelSerializerTest.assertEnrichmentMapEquals(expectedEM, roundTripEM);
}
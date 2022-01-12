@org.junit.Test
public void testURLInvalid() {
    eu.europeana.cloud.service.dps.OAIPMHHarvestingDetails sourceDetails = new eu.europeana.cloud.service.dps.OAIPMHHarvestingDetails(null, SCHEMA);
    eu.europeana.cloud.service.dps.storm.StormTaskTuple tuple = new eu.europeana.cloud.service.dps.storm.StormTaskTuple(TASK_ID, TASK_NAME, null, null, new java.util.HashMap<java.lang.String, java.lang.String>(), new eu.europeana.cloud.common.model.Revision(), sourceDetails);
    instance.execute(tuple);
    verify(oc, atMost(0)).emit(org.mockito.Matchers.any(org.apache.storm.tuple.Tuple.class), captor.capture());
}
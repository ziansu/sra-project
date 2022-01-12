@java.lang.Override
public void onRequestSucceeded(net.rithms.riot.api.request.AsyncRequest request) {
    net.rithms.riot.api.endpoints.masteries.dto.MasteryPages masteryPages = request.getDto();
    org.junit.Assert.assertNotNull(masteryPages);
    org.junit.Assert.assertEquals(81439110, masteryPages.getSummonerId());
}
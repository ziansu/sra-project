@org.junit.Test
public void testNovaJSONconversion() throws java.io.IOException, java.lang.InterruptedException, se.kth.karamel.common.exception.KaramelException {
    java.lang.String expectedString = com.google.common.io.Resources.toString(com.google.common.io.Resources.getResource("se/kth/hop/json/flink_nova.json"), com.google.common.base.Charsets.UTF_8);
    java.lang.String ymlString = com.google.common.io.Resources.toString(com.google.common.io.Resources.getResource("se/kth/hop/model/flink_nova.yml"), com.google.common.base.Charsets.UTF_8);
    java.lang.String json = api.yamlToJson(ymlString);
    org.junit.Assert.assertTrue(expectedString.equals(json));
}
@org.junit.Test
public void testI_Get_Sensor_Data() throws java.io.IOException, java.lang.InterruptedException {
    de.infinit.emp.test.utils.RestClient.Response res = de.infinit.emp.test.utils.RestClient.GET((("/api/sensor/" + (de.infinit.emp.test.SensorTest.sensorUuid)) + "/data"), de.infinit.emp.test.SensorTest.userSid, de.infinit.emp.test.SensorTest.userServer);
    org.junit.Assert.assertEquals(200, res.status);
    org.junit.Assert.assertEquals("ok", res.body.get("status"));
    org.junit.Assert.assertNotNull(res.body.get("data"));
}
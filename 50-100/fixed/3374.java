@org.junit.Test
public void testEquals() {
    com.github.ithildir.airbot.server.model.CityAndState cityAndState = new com.github.ithildir.airbot.server.model.CityAndState("foo", "ca");
    org.junit.Assert.assertTrue(cityAndState.equals(cityAndState));
    com.github.ithildir.airbot.server.model.CityAndState cityAndState2 = new com.github.ithildir.airbot.server.model.CityAndState("fOo", "cA");
    org.junit.Assert.assertTrue(cityAndState.equals(cityAndState2));
    cityAndState2 = new com.github.ithildir.airbot.server.model.CityAndState("bar baz", "wa");
    org.junit.Assert.assertFalse(cityAndState.equals(cityAndState2));
}
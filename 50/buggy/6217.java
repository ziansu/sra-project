@org.junit.Test
public void getAliases() {
    org.junit.Assert.assertThat(net.time4j.tz.threeten.JdkZoneProviderTest.zp.getAliases().get("Atlantic/Jan_Mayen"), org.hamcrest.CoreMatchers.is("Europe/Oslo"));
}
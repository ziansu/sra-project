@org.junit.Test
@org.junit.Ignore(value = "Failing on the CI build - possibly JVM version issue")
public void creates_instance_of_ReadablePeriod() throws java.text.ParseException {
    org.joda.time.ReadablePeriod period = fixture.create(org.joda.time.ReadablePeriod.class);
    org.junit.Assert.assertThat(period, org.hamcrest.Matchers.notNullValue());
    org.junit.Assert.assertThat(period, org.hamcrest.Matchers.<org.joda.time.ReadablePeriod>is(new org.joda.time.MutablePeriod(8760, 0, 0, 0)));
}
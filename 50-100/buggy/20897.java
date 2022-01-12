@org.junit.Test
public void filterByAgeAndGender() {
    com.unic.gatling.unicorns.mappers.Unicorn youngUnicorn = com.unic.gatling.unicorns.mappers.UnicornBuilder.anyFemaleUnicornBuilder().withAge(35).build();
    unicornMapper.create(youngUnicorn);
    java.util.List<com.unic.gatling.unicorns.mappers.Unicorn> youngUnicorns = unicornMapper.filter(35, com.unic.gatling.unicorns.mappers.Gender.female);
    org.junit.Assert.assertThat(youngUnicorns, org.hamcrest.Matchers.not(org.hamcrest.Matchers.empty()));
}
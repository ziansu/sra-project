@org.testng.annotations.Test
public void testSaveList() {
    java.util.List<com.mmnaseri.utils.spring.data.sample.models.Person> people = com.mmnaseri.utils.spring.data.sample.models.Person.list();
    java.util.List<com.mmnaseri.utils.spring.data.sample.models.Person> savedPeople = repository.save(people);
    org.hamcrest.MatcherAssert.assertThat(repository.findAll(), org.hamcrest.Matchers.is(org.hamcrest.Matchers.notNullValue()));
    org.hamcrest.MatcherAssert.assertThat(repository.findAll(), org.hamcrest.Matchers.hasSize(1));
}
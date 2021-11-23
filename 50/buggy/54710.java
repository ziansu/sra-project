@org.junit.Test
public void should_return_person_information() throws java.lang.Exception {
    person = new practice_9.Person("Tom", 21);
    java.lang.String resultString = "My name is Tom. I am 21 years old.";
    org.junit.Assert.assertThat(person.introduce(), org.hamcrest.core.Is.is(resultString));
}
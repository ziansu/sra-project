@org.junit.Test
@com.yeahmobi.yunit.annotation.DatabaseSetup
@com.yeahmobi.yunit.annotation.ExpectedDatabase
public void testInsert() throws java.lang.Exception {
    com.yeahmobi.ut_sample.entity.Person person = new com.yeahmobi.ut_sample.entity.Person();
    person.setId(3);
    person.setName("name3");
    person.setGender("f");
    this.personMapper.insert(person);
}
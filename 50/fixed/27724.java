@org.junit.Test
@com.yeahmobi.yunit.annotation.DatabaseSetup
@com.yeahmobi.yunit.annotation.ExpectedDatabase
public void testUpdate() throws java.lang.Exception {
    com.yeahmobi.ut_sample.entity.Person person = new com.yeahmobi.ut_sample.entity.Person();
    person.setId(1);
    person.setName("name111");
    this.personMapper.updateByPrimaryKeySelective(person);
}
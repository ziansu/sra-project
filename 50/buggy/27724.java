@org.junit.Test
@com.github.springtestdbunit.annotation.DatabaseSetup
@com.github.springtestdbunit.annotation.ExpectedDatabase
public void testUpdate() throws java.lang.Exception {
    com.yeahmobi.ut_sample.entity.Person person = new com.yeahmobi.ut_sample.entity.Person();
    person.setId(1);
    person.setName("name111");
    personMapper.updateByPrimaryKeySelective(person);
}
@org.junit.Test(expected = mapper.exception.ResultTypeInstantiationException.class)
public void shoulThrowException_whenResultTypeHasNotPublicNoArgConstructor() throws mapper.exception.ResultTypeInstantiationException {
    mapper.packagefortesting.TestChildClass testChildObj = new mapper.packagefortesting.TestChildClass();
    testChildObj.setSuperField1("string");
    testChildObj.setSuperField2(1);
    try {
        mapper.packagefortesting.TestHasNotPublicNoArgsConstructorClass result = mapper.util.MapperUtil.map(testChildObj, mapper.packagefortesting.TestHasNotPublicNoArgsConstructorClass.class);
        fail("map method should throw exception");
    } catch (mapper.exception.ResultTypeInstantiationException e) {
        throw e;
    }
}
@org.junit.Test
public void shoulThrowException_whenResultTypeHasNotPublicNoArgConstructor() {
    mapper.packagefortesting.TestChildClass testChildObj = new mapper.packagefortesting.TestChildClass();
    testChildObj.setSuperField1("string");
    testChildObj.setSuperField2(1);
    try {
        mapper.packagefortesting.TestHasNotPublicNoArgsConstructorClass result = mapper.util.MapperUtil.map(testChildObj, mapper.packagefortesting.TestHasNotPublicNoArgsConstructorClass.class);
        fail("map method should throw exception");
    } catch (mapper.exception.ResultTypeInstantiationException e) {
    }
}
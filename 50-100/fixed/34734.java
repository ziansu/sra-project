@org.junit.Test
public void test_pojo_structure_and_behavior() {
    java.util.List<com.openpojo.reflection.PojoClass> pojoClasses = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.nike.cerberus.domain");
    org.junit.Assert.assertEquals(19, pojoClasses.size());
    com.openpojo.validation.Validator validator = com.openpojo.validation.ValidatorBuilder.create().with(new com.openpojo.validation.rule.impl.GetterMustExistRule()).with(new com.openpojo.validation.rule.impl.SetterMustExistRule()).with(new com.openpojo.validation.test.impl.SetterTester()).with(new com.openpojo.validation.test.impl.GetterTester()).build();
    validator.validate(pojoClasses);
}
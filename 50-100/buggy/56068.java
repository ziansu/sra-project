@org.junit.Test
public void testGBK() {
    org.dangcat.commons.validate.GBKValidator validator = new org.dangcat.commons.validate.GBKValidator();
    junit.framework.Assert.assertTrue(validator.isValid("测"));
    junit.framework.Assert.assertTrue(validator.isValid("测试"));
    junit.framework.Assert.assertTrue(validator.isValid("A测试B"));
    junit.framework.Assert.assertTrue(validator.isValid("AB测试"));
    junit.framework.Assert.assertFalse(validator.isValid("AA"));
    junit.framework.Assert.assertFalse(validator.isValid("11"));
}
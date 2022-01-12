@org.junit.Test
public void testConvertUtilsTest() {
    java.lang.System.out.println(org.apache.commons.beanutils.ConvertUtils.convert(888.0F));
    java.lang.System.out.println(org.apache.commons.beanutils.ConvertUtils.convert(888.0F, java.math.BigDecimal.class));
}
@org.junit.Test
public void testCollectNullIterator() {
    org.junit.Assert.assertEquals(null, com.feilong.core.util.CollectionsUtil.collect(((java.util.Iterator<java.lang.Long>) (null)), org.apache.commons.collections4.TransformerUtils.stringValueTransformer()));
}
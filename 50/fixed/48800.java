@org.junit.Test
public void testCollectNullIterable() {
    org.junit.Assert.assertEquals(null, com.feilong.core.util.CollectionsUtil.collect(((java.util.List<java.lang.Long>) (null)), com.feilong.store.member.User.class));
}
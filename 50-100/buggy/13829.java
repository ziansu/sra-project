@java.lang.Override
protected void onTemplate(org.apache.jackrabbit.oak.segment.RecordId parentId, org.apache.jackrabbit.oak.segment.RecordId templateId) {
    org.apache.jackrabbit.oak.segment.TemplateInfo info = parseTemplate(templateId);
    junitx.framework.ComparableAssert.assertEquals(templateId, info.templateId);
    org.junit.Assert.assertTrue(info.hasPrimaryType);
    org.junit.Assert.assertTrue(info.hasMixinType);
    org.junit.Assert.assertFalse(info.zeroChildNodes);
    org.junit.Assert.assertFalse(info.manyChildNodes);
    junitx.framework.ComparableAssert.assertEquals(2, info.mixinCount);
    junitx.framework.ComparableAssert.assertEquals(1, info.propertyCount);
}
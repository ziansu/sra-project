@java.lang.Override
protected void onTemplate(org.apache.jackrabbit.oak.segment.RecordId parentId, org.apache.jackrabbit.oak.segment.RecordId templateId) {
    org.apache.jackrabbit.oak.segment.TemplateInfo info = parseTemplate(templateId);
    org.junit.Assert.assertEquals(templateId, info.templateId);
    org.junit.Assert.assertTrue(info.hasPrimaryType);
    org.junit.Assert.assertTrue(info.hasMixinType);
    org.junit.Assert.assertFalse(info.zeroChildNodes);
    org.junit.Assert.assertFalse(info.manyChildNodes);
    org.junit.Assert.assertEquals(2, info.mixinCount);
    org.junit.Assert.assertEquals(1, info.propertyCount);
}
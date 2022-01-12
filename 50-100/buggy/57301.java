@org.junit.Test
public void testInitKnowledgeBase() {
    manager.initKnowledgeBase();
    org.kie.internal.KnowledgeBase base = manager.getKnowledgeBase();
    org.junit.Assert.assertNotNull("Model is null", base.getFactType(SampleData.PKG_NAME, "RecordIn"));
    org.junit.Assert.assertNotNull(base.getRule(SampleData.PKG_NAME, org.talend.survivorship.sample.SampleData.RULES[0].getRuleName()));
    org.junit.Assert.assertNotNull(base.getProcess(((org.talend.survivorship.sample.SampleData.PKG_NAME) + ".SurvivorFlow")));
}
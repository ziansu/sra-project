private boolean saveMatchRule() {
    getCurrentModelElement().setRecordLinkageAlgorithm(selectAlgorithmSection.getAlgorithmName());
    org.talend.dataquality.properties.TDQMatchRuleItem matchRuleItem = ((org.talend.dataquality.properties.TDQMatchRuleItem) (getCurrentRepNode().getObject().getProperty().getItem()));
    org.talend.utils.sugars.ReturnCode rc = org.talend.dq.writer.impl.ElementWriterFactory.getInstance().createdMatchRuleWriter().save(matchRuleItem, java.lang.Boolean.FALSE);
    return rc.isOk();
}
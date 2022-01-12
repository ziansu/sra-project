@org.junit.Test
public void multipleAdditiveTreesTestMissingTreeFeature() throws java.lang.Exception {
    final org.apache.solr.ltr.model.ModelException expectedException = new org.apache.solr.ltr.model.ModelException("MultipleAdditiveTreesModel tree node is leaf with left=-100.0 and right=75.0");
    try {
        createModelFromFiles("multipleadditivetreesmodel_no_feature.json", "multipleadditivetreesmodel_features.json", null);
        fail(("multipleAdditiveTreesTestMissingTreeFeature failed to throw exception: " + expectedException));
    } catch (org.apache.solr.ltr.model.ModelException actualException) {
        assertEquals(expectedException.toString(), actualException.toString());
    }
}
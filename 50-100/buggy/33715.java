@org.junit.Test
public void multipleAdditiveTreesTestNoThreshold() throws java.lang.Exception {
    final org.apache.solr.ltr.model.ModelException expectedException = new org.apache.solr.ltr.model.ModelException("MultipleAdditiveTreesModel tree node is missing threshold");
    try {
        createModelFromFiles("multipleadditivetreesmodel_no_threshold.json", "multipleadditivetreesmodel_features.json", null);
        fail(("multipleAdditiveTreesTestNoThreshold failed to throw exception: " + expectedException));
    } catch (java.lang.Exception actualException) {
        java.lang.Throwable rootError = getRootCause(actualException);
        assertEquals(expectedException.toString(), rootError.toString());
    }
}
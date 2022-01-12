@org.junit.Test
public void testFeatureGroupTypeAlternative() throws de.ovgu.featureide.fm.core.io.UnsupportedModelException, java.io.FileNotFoundException {
    for (de.ovgu.featureide.fm.core.base.IFeature origF : origFm.getFeatures()) {
        if (origF.getStructure().isAlternative()) {
            de.ovgu.featureide.fm.core.base.IFeature newF = newFm.getFeature(origF.getName());
            if (newF == null) {
            }else {
                org.junit.Assert.assertTrue(failureMessage, newFm.getFeature(origF.getName()).getStructure().isAlternative());
            }
        }
    }
}
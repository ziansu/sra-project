@org.junit.Test
public void testFeatureGroupTypeOr() throws de.ovgu.featureide.fm.core.io.UnsupportedModelException, java.io.FileNotFoundException {
    for (de.ovgu.featureide.fm.core.base.IFeature origF : origFm.getFeatures()) {
        if (origF.getStructure().isOr()) {
            de.ovgu.featureide.fm.core.base.IFeature newF = newFm.getFeature(origF.getName());
            org.junit.Assert.assertTrue(failureMessage, newF.getStructure().isOr());
        }
    }
}
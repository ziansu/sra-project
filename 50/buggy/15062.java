@org.junit.Test
public void testPage() throws java.io.FileNotFoundException, java.net.URISyntaxException, org.verapdf.core.FeatureParsingException {
    java.util.List<org.verapdf.features.tools.FeatureTreeNode> treeNodes = org.verapdf.features.PBFeatureParserTest.collection.getFeatureTreesForType(FeaturesObjectTypesEnum.PAGE);
    org.junit.Assert.assertTrue(treeNodes.contains(org.verapdf.features.TestNodeGenerator.getPage()));
}
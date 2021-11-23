@org.junit.Test
public void checkSpatialAlgebraIsInSemanticTags_LINESTRING_GEOMETRYCOLLECTION() throws net.sharkfw.knowledgeBase.SharkKBException {
    net.sharkfw.knowledgeBase.SpatialSemanticTag tag1 = net.sharkfw.knowledgeBase.inmemory.InMemoSharkKB.createInMemoSpatialSemanticTag(JTSMain.LineString_Berlin_HTW_WH_Complete);
    net.sharkfw.knowledgeBase.SpatialSemanticTag tag2 = net.sharkfw.knowledgeBase.inmemory.InMemoSharkKB.createInMemoSpatialSemanticTag(JTSMain.Geometrycollection_Berlin_HTW_Complete_With_MULTIPOLYGON);
    org.junit.Assert.assertEquals(false, JTSMain.usedFunctionClass.isIn(tag1, tag2));
    org.junit.Assert.assertEquals(true, JTSMain.usedFunctionClass.isIn(tag2, tag1));
}
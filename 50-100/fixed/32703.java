@org.junit.Test
public void checkSpatialAlgebraIsIn_SharkSpatialAlgebra() throws net.sharkfw.knowledgeBase.SharkKBException {
    net.sharkfw.knowledgeBase.geom.SharkGeometry shark_geom1 = net.sharkfw.knowledgeBase.geom.inmemory.InMemoSharkGeometry.createGeomByWKT(JTSMain.string_Multipolygon_Berlin_HTW_WH_Complete);
    net.sharkfw.knowledgeBase.geom.SharkGeometry shark_geom2 = net.sharkfw.knowledgeBase.geom.inmemory.InMemoSharkGeometry.createGeomByWKT(JTSMain.string_Multipolygon_Berlin_HTW_Complete);
    net.sharkfw.knowledgeBase.SpatialSemanticTag tag1 = net.sharkfw.knowledgeBase.inmemory.InMemoSharkKB.createInMemoSpatialSemanticTag(shark_geom1);
    net.sharkfw.knowledgeBase.SpatialSemanticTag tag2 = net.sharkfw.knowledgeBase.inmemory.InMemoSharkKB.createInMemoSpatialSemanticTag(shark_geom2);
    SpatialAlgebra a = new SpatialAlgebra();
    org.junit.Assert.assertEquals(true, JTSMain.usedFunctionClass.isIn(tag2, tag1));
}
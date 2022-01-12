@org.junit.Test
public void testHasLodChanged() {
    com.jme3.terrain.geomipmap.FakeTerrainQuad root = ((com.jme3.terrain.geomipmap.FakeTerrainQuad) (createNestedQuad(1, "")));
    assertFalse(root.hasLodChanged(location, updates, lodCalculator));
    assertTrue(root.hasLodChanged(location, updates, fakeLodCalculator));
    com.jme3.terrain.geomipmap.FakeTerrainQuad leaf = ((com.jme3.terrain.geomipmap.FakeTerrainQuad) (createNestedQuad(1, "")));
    leaf.attachChild(children[1]);
    assertTrue(leaf.hasLodChanged(location, updates, fakeLodCalculator));
}
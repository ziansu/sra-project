@org.junit.Test
public void testnostartpoint() {
    int[][] maparr = new int[][]{ new int[]{ 0 , 0 , 0 , 0 } , new int[]{ 0 , 2 , 3 , 0 } , new int[]{ 0 , 0 , 4 , 0 } , new int[]{ 0 , 0 , 9999 , 0 } };
    MapModel testmapobj = new MapModel("testmap", maparr);
    assertFalse(testmapobj.validateMap());
}
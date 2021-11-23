@org.junit.Test
public void testRun() {
    java.lang.System.out.println("run");
    java.lang.String absolutePath = new java.io.File(this.getClass().getResource("testRegion.png").getPath()).getAbsolutePath();
    segmentation.RegionGrowing rg = new segmentation.RegionGrowing(absolutePath, 0);
    rg.run();
    int size = rg.getRegions_list().values().size();
    java.lang.System.out.println(size);
    assertEquals(size, 2);
}